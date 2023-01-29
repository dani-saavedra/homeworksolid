package modelo;

public class VerMaterias {
    
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) { 
            System.out.println(estudiante.asignaturas);
        }
    }
}
