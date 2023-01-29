package service;

import modelo.Envio;
import modelo.Estudiante;


/*public class EnvioMaterial {

    public void enviarMaterialEstudiante(Estudiante estudiante) {
        if (estudiante.getCarrera() instanceof Informatica) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.getCarrera() instanceof Negocios) {
            //lo mismo de arriba pero con otra informacion
        }
        if (estudiante.getCarrera() instanceof IngenieriaIndustrial) {
            //
        }
    }
}*/

public class EnvioMaterial {

    
    private ServicioEmail servicioEmail;
    private Envio envio; 
    
    public EnvioMaterial (ServicioEmail servicioEmail, Envio envio){
        this.servicioEmail=servicioEmail;
        this.envio=envio;
    }


    public void enviarMaterialEstudiante(Estudiante estudiante) {
;
        envio.materiales = estudiante.materiales;
        envio.saludoDirector = estudiante.saludoDirector;
        servicioEmail.enviarEmail(envio);
        

}
}

