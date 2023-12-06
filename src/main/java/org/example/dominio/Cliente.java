package org.example.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Cliente {
    private Incidente incidente;
    private String razonSocial;
    private String CUIT;
    private List<Servicio> servicios;
    private List<MensajeDeNotificacion> mensajeDeNotificaciones;

    //CONTRUCTOR//


    public Cliente(String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
    }

    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }

    public void notificarIncidente(Servicio servicio){
        Incidente nuevoIncidente = new Incidente();
        MensajeDeNotificacion nuevoMensaje = new MensajeDeNotificacion("Reporto Incidente",
                servicio.getTipoDeProblemas().get(0).getNombre(), nuevoIncidente);
        this.mensajeDeNotificaciones.add(nuevoMensaje);
    }

    //GETTERS Y SETTERS//
    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}

