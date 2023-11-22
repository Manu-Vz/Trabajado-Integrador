package Programa;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor

/* Lombok <-> Constructor
--> final <-- scope fieldType fieldName> Atributo en constructor requerido.
ref: https://stackoverflow.com/questions/23761242/java-lombok-omitting-one-field-in-allargsconstructor
 */
public class Servicio {
    private int idServicio;
    final private String nombreServicio;
    private Especialidad especialidad;
}
