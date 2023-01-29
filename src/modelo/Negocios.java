package modelo;
import java.util.Arrays;
import java.util.List;

public class Negocios extends Estudiante {
    

    public Negocios(String nombre){

        super(nombre,asignaturas(),materiales(), "Bienvenido al programa de Negocios, adjunto material necesario");
        
    }
    private static List<String> asignaturas() {
        return Arrays.asList("Negocios, Administracion I, Historia de la Administracion");
    }

    private static List<String> materiales() {
        return Arrays.asList("Libro Negocios", "Cartilla");
    }

}  
