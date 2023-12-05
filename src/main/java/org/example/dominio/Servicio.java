package org.example.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Servicio {
    private String nombre;
    private String description;
    private List<TipoProblema> tipoDeProblemas;

    public Servicio(String nombre, String description, List<TipoProblema> tipoDeProblemas) {
        this.nombre = nombre;
        this.description = description;
        this.tipoDeProblemas = tipoDeProblemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TipoProblema> getTipoDeProblemas() {
        return tipoDeProblemas;
    }

    public void setTipoDeProblemas(List<TipoProblema> tipoDeProblemas) {
        this.tipoDeProblemas = tipoDeProblemas;
    }
}
