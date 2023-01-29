package service;
import modelo.Envio;
import modelo.Estudiante;


public class EnvioMaterial {

    private ServicioEmail servicioEmail;
    private Envio envio; 
    
    public EnvioMaterial (ServicioEmail servicioEmail, Envio envio){
        this.servicioEmail=servicioEmail;
        this.envio=envio;
    }

    //Principio Open/Closed
    public void enviarMaterialEstudiante(Estudiante estudiante) {
        envio.materiales = estudiante.materiales;
        envio.saludoDirector = estudiante.saludoDirector;
        servicioEmail.enviarEmail(envio);
    }
}

