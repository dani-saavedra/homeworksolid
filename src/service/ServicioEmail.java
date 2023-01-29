package service;
import modelo.Envio;

//Principio Interface Segregation
public interface ServicioEmail {
    void enviarEmail(Envio envio);
}
