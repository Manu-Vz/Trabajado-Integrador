package org.example.dominio;

import java.time.LocalDate;
import java.util.List;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Incidente extends Especialidad{

    @NonNull
    private String titulo;
    @NonNull
    private LocalDate diaDeCreacion;
    private LocalDate diaDeResolucion;
    private List<Problema> problemas;
    @NonNull
    private Servicio servicioReportado;
    private EstadoDeIncidente estado;
    private Tecnico tecnicoAsignado;

    public void agregarProblema(Problema problema){
        this.problemas.add(problema);
    }
}
