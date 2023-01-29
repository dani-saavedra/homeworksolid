package service;
import modelo.Asignar;
import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial implements Asignar {

    /* Se realiza un overrida para enviar a la interfaz respectiva, de esta forma
    se minimizan dependencias entre altos y bajos niveles.

    public void enviarMaterialEstudiante(Estudiante estudiante) {
        if (estudiante.carrera.equals("Informatica")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.carrera.equals("Administracion")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Cobija");
            envio.material.add("Almohada");
            envio.saludoDirector = "Lizcano envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.carrera.equals("Industrial")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Tableta");
            envio.material.add("Planos");
            envio.saludoDirector = "Cano envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
    }

     */

    @Override
    public void asignarDatos(Estudiante estudiante) {
        if (estudiante.carrera.equals("Informatica")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.carrera.equals("Administracion")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Cobija");
            envio.material.add("Almohada");
            envio.saludoDirector = "Lizcano envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.carrera.equals("Industrial")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Tableta");
            envio.material.add("Planos");
            envio.saludoDirector = "Cano envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
    }
}
