package org.example;

import lombok.Data;

@Data
public class Cliente {
    private Incidente incidente;
    private String razonSocial;
    private String CUIT;
    private Servicio servicios;
    
}
