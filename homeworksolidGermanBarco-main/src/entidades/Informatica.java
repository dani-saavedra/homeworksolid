package entidades;

import modelo.Carrera;

public class Informatica extends modelo.Carrera {

    /* Se crea la materia/carrera de informatica con el fin de no usar el main como contructor,
    esta posee la herencia de carrera y usa Override para mostrar sus materias.
     */
    public Informatica() {
        super("Informatica", "Programacion, Arquitectura, Base de datos","Computador y mouse", "Jenny");
    }

    @Override
    public void verMateriasEstudiantes() {
        System.out.println(getMaterias());
    }
}
