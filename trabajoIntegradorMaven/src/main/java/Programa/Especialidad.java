package Programa;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Especialidad {
    private String nombre;
    private String decripcion;


    //CONSTRUCTOR//


    public Especialidad(String nombre, String decripcion) {
        this.nombre = nombre;
        this.decripcion = decripcion;
    }

    //GETTERS Y SETTERS//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}
