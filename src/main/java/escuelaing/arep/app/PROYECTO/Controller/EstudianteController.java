/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Controller;

import escuelaing.arep.app.PROYECTO.Documents.Estudiante;
import escuelaing.arep.app.PROYECTO.Service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas
 */
@RestController
@RequestMapping("estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @CrossOrigin
    @PostMapping(value = "/create-estudiante")
    public ResponseEntity<?> createEstudiante(@RequestBody Estudiante estudiante) {
        try {

            estudianteService.createEstudiante(estudiante);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @CrossOrigin
    @GetMapping(value = "/{carne}")
    public ResponseEntity<?> estudianteByCarne(@PathVariable("carne") Integer carne) {
        try {

            Estudiante est = estudianteService.findByCarne(carne);
            return new ResponseEntity<>(est,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }
    
    @CrossOrigin
    @GetMapping(value = "/all-estudiantes")
    public ResponseEntity<?> findAllEstudiantes(){
        try {
            List<Estudiante> est = estudianteService.findAllEstudiantes();
            return new ResponseEntity<>(est,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    
}
