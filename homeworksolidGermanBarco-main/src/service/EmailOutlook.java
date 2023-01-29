package service;

import modelo.Envio;

public class EmailOutlook {

    //Se envia el email adjunto alos materiales por medio del metodo único en la clase
    void enviarEmail(Envio envio) {
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }
}
