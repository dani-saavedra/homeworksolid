package entidades;

import modelo.Carrera;

public class Administracion extends modelo.Carrera {

    /* Se crea la materia/carrera de administración con el fin de no usar el main como contructor,
    esta posee la herencia de carrera y usa Override para mostrar sus materias.
     */
    public Administracion() {
        super("Administracion", "Negocios, Administracion I, Historia de la Administracion","Cobija y almohada", "Lizcano");
    }

    @Override
    public void verMateriasEstudiantes() {
        System.out.println(getMaterias());
    }
}