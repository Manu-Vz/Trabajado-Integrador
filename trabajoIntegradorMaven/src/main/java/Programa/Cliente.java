package Programa;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cliente {
    private Incidente incidente;
    private String razonSocial;
    private String CUIT;
    private Servicio servicios;


}
