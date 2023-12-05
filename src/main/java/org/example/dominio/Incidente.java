/*package org.example.dominio;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor
public class Incidente extends Especialidad{

    private String titulo;
    private LocalDate diaDeCreacion;
    private LocalDate diaDeResolucion;
    private List<Problema> problemas;
    private Servicio servicioReportado;
    private EstadoDeIncidente estado;
    private Tecnico tecnicoAsignado;

    //CONSTRUCTOR//
    public Incidente() {
    }

    public Incidente(String titulo, LocalDate diaDeCreacion, Servicio servicioReportado) {
        this.titulo = titulo;
        this.diaDeCreacion = diaDeCreacion;
        this.servicioReportado = servicioReportado;
    }

    public void agregarProblema(Problema problema){
        this.problemas.add(problema);
    }
}
*/