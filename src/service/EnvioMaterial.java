package service;

import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {

    void enviarMaterialEstudiante(Estudiante estudiante) {
        if (estudiante.carrera.equals("Informatica")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            Email email = new Email();
            email.enviarEmail();
        }
        if (estudiante.carrera.equals("Administracion")) {
          //
        }
        if (estudiante.carrera.equals("Industrial")) {
            //
        }
    }
}
