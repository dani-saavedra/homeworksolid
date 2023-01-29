package main;


import modelo.Envio;
import modelo.Estudiante;
import modelo.Informatica;
import modelo.IngenieriaIndustrial;
import modelo.Negocios;
import modelo.VerMaterias;
import service.EmailGmail;
import service.EmailOutlook;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {

        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                //new IngenieriaIndustrial("Camila"),
                //new Negocios("Nicolas")
            
        };
        VerMaterias.verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial(new EmailOutlook(), new Envio());
        material.enviarMaterialEstudiante(new Informatica("Daniel"));
        //material.enviarMaterialEstudiante(new IngenieriaIndustrial("Camila"));
        //material.enviarMaterialEstudiante(new Negocios("Nicolas"));

    }
}
