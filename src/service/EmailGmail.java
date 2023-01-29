package service;

import modelo.Envio;

public class EmailGmail implements ServicioEmail{

    @Override
    public void enviarEmail(Envio envio) {
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR GMAIL BY GOOGLE (...) \n");
        System.out.println("NOTIFICACIÓN: EMAIL ENVIADO y correspondencia \n" + envio);
    }
}