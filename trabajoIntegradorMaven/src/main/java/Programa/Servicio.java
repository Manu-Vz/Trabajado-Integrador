package Programa;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Servicio {
    private int idServicio;
    private String nombreServicio;
    private Especialidad especialidad;
}
