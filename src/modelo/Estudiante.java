package modelo;

import java.util.List;

public abstract class Estudiante {

    public String nombre;
    public List<String> asignaturas;
    public List<String> materiales;
    public String saludoDirector;


    public Estudiante(String nombre, List<String> asignaturas, List<String> materiales, String saludoDirector) {
        this.nombre = nombre;
        this.asignaturas=asignaturas;
        this.materiales = materiales;
        this.saludoDirector = saludoDirector;
        
    }
    
}
