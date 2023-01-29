package modelo;
import java.util.Arrays;
import java.util.List;

public class Informatica extends Estudiante {
    

    public Informatica(String nombre){

        super(nombre,asignaturas(),materiales(), "Bienvenido al programa de Informatica, adjunto material necesario");
        
    }

    private static List<String> asignaturas() {
        return Arrays.asList("Programacion", "Arquitectura", "Base de datos");
    }
    
    private static List<String> materiales() {
        return Arrays.asList("Mouse", "PC", "Software");
    }

}  
// super(nombre, "Programacion, Arquitectura, Base de datos", "Requiere: Mouse, PC");
