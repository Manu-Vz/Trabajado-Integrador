package Programa;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor
public class Incidente extends Especialidad{

    private String titulo;
    private LocalDate diaDeCreacion;
    private LocalDate diaDeResolucion;
    private List<Problema> problemas;
    private EstadoDeIncidente estado;
    private Tecnico tecnicoAsignado;

    
    
    
}
