package entidades;

import modelo.Carrera;

public class Industrial extends modelo.Carrera {

    /* Se crea la materia/carrera de industrial con el fin de no usar el main como contructor,
    esta posee la herencia de carrera y usa Override para mostrar sus materias.
     */

    public Industrial() {
        super("Industrial", "Procesos, Analitica de datos, Gestion de Calidad","Tableta y planos", "Cano");
    }

    @Override
    public void verMateriasEstudiantes() {
        System.out.println(getMaterias());
    }
}