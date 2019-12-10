/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Service;

import escuelaing.arep.app.PROYECTO.Documents.Estudiante;
import escuelaing.arep.app.PROYECTO.Repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas
 */
@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;
    
    public void createEstudiante(Estudiante est) {
        estudianteRepository.save(est);
    }

    public List<Estudiante> findAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante findByCarne(Integer carne) {
        for (int i = 0; i < findAllEstudiantes().size(); i++) {
            if (findAllEstudiantes().get(i).getCarne().equals(carne)) {
                return findAllEstudiantes().get(i);
            }
        }
        return null;
    }

    public void deleteByName(Integer carne) {
        estudianteRepository.delete(findByCarne(carne));
    }
}
