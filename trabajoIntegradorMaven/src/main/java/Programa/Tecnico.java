package Programa;

import lombok.Data;

@Data
public class Tecnico {
    private int id;
    private int DNI;
    private Especialidad especialidad;
    private String nombre;
    private String apellido;
    private MedioDeComunicacion contacto;
    private Incidente incidente;
    


    public void InformarEstadoCliente(){

    }

    public void cambiarestadoincidente(){

    }
    
    
}
