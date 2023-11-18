package Programa;

import lombok.Data;

@Data
public class Servicio {
    private int idServicio;
    private String nombreServicio;
    private Especialidad especialidad;
}
