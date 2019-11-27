/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Controller;

import escuelaing.arep.app.PROYECTO.Documents.Funcionario;
import escuelaing.arep.app.PROYECTO.Service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 *
 * @author Nicolas
 */
@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @CrossOrigin
    @PostMapping(value = "/create-funcionario")
    public ResponseEntity<?> createDish(@RequestBody Funcionario funcionario) {
        try {

            funcionarioService.createFuncionario(funcionario);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @CrossOrigin
    @GetMapping(value = "/{email}")
    public ResponseEntity<?> DishByName(@PathVariable("email") String email) {        
        try {
            Funcionario dish;
            List<Funcionario> dishes = funcionarioService.findAllFuncionarios();
            for (Funcionario d : dishes) {
                if (d.getEmail().equals(email)) {
                    return new ResponseEntity<>(d, HttpStatus.OK);
                }
            }
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }

}
