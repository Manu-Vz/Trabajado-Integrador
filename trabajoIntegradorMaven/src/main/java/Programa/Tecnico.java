package Programa;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Tecnico {
    private int id;
    private int dni;
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
