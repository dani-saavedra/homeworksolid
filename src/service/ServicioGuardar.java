package service;
import modelo.GuardarEstudiante;

public class ServicioGuardar {
    private GuardarEstudiante interfaz;

    public ServicioGuardar(GuardarEstudiante interfaz) {
        this.interfaz = interfaz;
    }
    
    public void guardar () {
        interfaz.guardarEstudiante();
    }
}
