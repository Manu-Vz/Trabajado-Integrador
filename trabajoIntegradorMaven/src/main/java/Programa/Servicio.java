package Programa;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Servicio {
    private String nombre;
    private String description;
    private List<TipoProblema> tipoDeProblemas;
}
