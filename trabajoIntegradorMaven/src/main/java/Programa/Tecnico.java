package Programa;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor

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
