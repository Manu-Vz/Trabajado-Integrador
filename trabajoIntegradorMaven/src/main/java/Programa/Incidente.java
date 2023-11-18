package Programa;

import java.time.LocalDate;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Incidente extends Especialidad{
    private int id;
    private LocalDate fecha;
    private boolean estado;
    private String consideraciones;
    private final double tiempoDeResolucion;

    public Incidente(int id, LocalDate fecha, boolean estado, String consideraciones, double tiempoDeResolucion) {
        this.fecha = fecha;
        this.estado = estado;
        this.consideraciones = consideraciones;
        this.tiempoDeResolucion = tiempoDeResolucion;
    }
    
    
    
}
