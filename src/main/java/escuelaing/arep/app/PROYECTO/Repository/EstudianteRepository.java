/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Repository;

import escuelaing.arep.app.PROYECTO.Documents.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nicolas
 */
@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

    Estudiante findByCarne(Integer carne);

    public void delete(Estudiante estudiante);

}
