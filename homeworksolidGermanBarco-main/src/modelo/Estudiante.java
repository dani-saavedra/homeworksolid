package modelo;

public abstract class Estudiante {

    //Se definen las propiedades de la clase padrea abstracta para los hijos
    public String nombre;
    public String carrera;

    //Se envian y clasifican segun tipos para los hijos
    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    //Se crea la clase original de guardar estudiante

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
