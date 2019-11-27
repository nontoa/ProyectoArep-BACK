/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Repository;

import escuelaing.arep.app.PROYECTO.Documents.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nicolas
 */


@Repository
public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {
    
    Funcionario findByEmail(String email);
    
    public void delete(Funcionario funcionario);
}
