package modelo;
import java.util.List;

public class Envio {
    public List<String> materiales;
    public String saludoDirector;

    @Override
    public String toString() {
        return "Correo Electronico: {" +
                "saludoDirector=" + saludoDirector +
                ", Materiales='" + materiales + '\'' +
                '}';
    }
}