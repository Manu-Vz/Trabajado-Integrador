package org.example.dominio;

import java.util.List;

public class TipoProblema {
    private String nombre;
    private String descripcion;
    private int tiempoMaximoDeResolucion;
    private List<Especialidad> especialidades;

    //CONSTRUCTORES//
    public TipoProblema(){}

    public TipoProblema(String nombre, String descripcion, int tiempoMaximoDeResolucion, List<Especialidad> especialidades) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoMaximoDeResolucion = tiempoMaximoDeResolucion;
        this.especialidades = especialidades;
    }
    //GETTERS Y SETTERS//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoMaximoDeResolucion() {
        return tiempoMaximoDeResolucion;
    }

    public void setTiempoMaximoDeResolucion(int tiempoMaximoDeResolucion) {
        this.tiempoMaximoDeResolucion = tiempoMaximoDeResolucion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
}
