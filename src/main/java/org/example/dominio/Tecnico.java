/*package org.example.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@RequiredArgsConstructor
@Entity
public class Tecnico {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Set<Especialidad> especialidad;
    private boolean estaDisponible;
    private List<MensajeDeNotificacion> notificaciones;
    private MedioDeComunicacion contacto;
    private List<TiempoEstimadoDeResolucionDeIncidente> estimaciones;

    //CONSTRUCTORES//
    public Tecnico(){}


    //GETTERS Y SETTERS//
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Set<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Set<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public List<MensajeDeNotificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<MensajeDeNotificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public MedioDeComunicacion getContacto() {
        return contacto;
    }

    public void setContacto(MedioDeComunicacion contacto) {
        this.contacto = contacto;
    }

    public List<TiempoEstimadoDeResolucionDeIncidente> getEstimaciones() {
        return estimaciones;
    }

    public void setEstimaciones(List<TiempoEstimadoDeResolucionDeIncidente> estimaciones) {
        this.estimaciones = estimaciones;
    }




    public void InformarEstadoCliente(){

    }

    public void cambiarestadoincidente(){

    }
    
    
}
*/