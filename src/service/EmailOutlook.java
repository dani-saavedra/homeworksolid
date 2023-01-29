package service;

import modelo.Envio;

public class EmailOutlook implements ServicioEmail{

    @Override
    public void enviarEmail(Envio envio) {
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR OUTLOOK BY MICROSOFT (...)");
        System.out.println("NOTIFICACIÓN: EMAIL ENVIADO y correspondencia \n " + envio);
    }
}
