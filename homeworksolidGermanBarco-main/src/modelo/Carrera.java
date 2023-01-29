package modelo;

public abstract class Carrera {

    //Se definen las propiedades a los hijos
    public String Materias;

    public String Carrera;

    public String Materiales;

    public String Director;

    //Getters y setters
    public String getCarrera() {
        return Carrera;
    }

    public String getMaterias() {
        return Materias;
    }

    //Se envian las propiedades para los hijos
    public Carrera(String carreras, String materias, String materiales, String director) {
        Carrera = carreras;
        Materias = materias;
        Materiales = materiales;
        Director = director;
    }

    //Método para ver las materias original pre-override
    public void verMateriasEstudiantes(){

        System.out.println("Programacion, Arquitectura, Base de datos, " +
                "Negocios, Administracion I, Historia de la Administracion," +
                "Procesos, Analitica de datos, Gestion de Calidad");

    }

}
