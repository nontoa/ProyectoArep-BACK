/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Service;

import escuelaing.arep.app.PROYECTO.Documents.Funcionario;
import escuelaing.arep.app.PROYECTO.Repository.FuncionarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void createFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario findByEmail(String email) {
        for (int i = 0; i < findAllFuncionarios().size(); i++) {
            if (findAllFuncionarios().get(i).getEmail().equals(email)) {
                return findAllFuncionarios().get(i);
            }
        }
        return null;
    }

    public void deleteByName(String email) {
        funcionarioRepository.delete(findByEmail(email));
    }
}
