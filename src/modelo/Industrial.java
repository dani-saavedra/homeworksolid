package modelo;
import java.util.Arrays;
import java.util.List;

public class Industrial extends Estudiante {
    
    public Industrial(String nombre){
        super(nombre,asignaturas(),materiales(), "Bienvenido al programa de Industrial, adjunto material necesario");   
    }
    
    private static List<String> asignaturas() {
        return Arrays.asList("Procesos, Analitica de datos, Gestion de Calidad ");
    }

    private static List<String> materiales() {
        return Arrays.asList("PC", "Calculadora");
    }

}  