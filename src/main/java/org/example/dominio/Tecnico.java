package org.example.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor
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


    public void InformarEstadoCliente(){

    }

    public void cambiarestadoincidente(){

    }
    
    
}
