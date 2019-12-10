/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaing.arep.app.PROYECTO.Documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Nicolas
 */
@Document(collection = "Estudiante")
public class Estudiante {
    
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nombre;

    private String apellido;

    private Integer cedula;

    private Integer carne;

    private String direccion;
    
    private Integer telefono;
    
    private Integer semestre;
    
    private String programa;
    
    private String carrera;
    
    private Integer materias;
    
    private Boolean procesoa;
    
    public Estudiante(){
    
    }

    public Estudiante(String id, String nombre, String apellido, Integer cedula, Integer carne, String direccion, Integer telefono, Integer semestre, String programa, String carrera, Integer materias, Boolean procesoa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.carne = carne;
        this.direccion = direccion;
        this.telefono = telefono;
        this.semestre = semestre;
        this.programa = programa;
        this.carrera = carrera;
        this.materias = materias;
        this.procesoa = procesoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCarne() {
        return carne;
    }

    public void setCarne(Integer carne) {
        this.carne = carne;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getMaterias() {
        return materias;
    }

    public void setMaterias(Integer materias) {
        this.materias = materias;
    }

    public Boolean getProcesoa() {
        return procesoa;
    }

    public void setProcesoa(Boolean procesoa) {
        this.procesoa = procesoa;
    }
    
    
    
}
