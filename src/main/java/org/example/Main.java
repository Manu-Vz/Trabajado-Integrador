package org.example;
import org.example.dominio.*;
import org.example.repositorios.EspecialidadRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        cargarDatosDB();
        //obtenerDatosDB();
       /* List<Especialidad> especialidadesDelTipo1 = new ArrayList<>();
        especialidadesDelTipo1.add(especialidad1);
        especialidadesDelTipo1.add(especialidad2);
        TipoProblema tipo1 = new TipoProblema("Error en Desarrollo", "Bugs", 12,especialidadesDelTipo1);

        List<Especialidad> especialidadesDelTipo2 = new ArrayList<>();
        especialidadesDelTipo2.add(especialidad1);
        especialidadesDelTipo2.add(especialidad2);
        especialidadesDelTipo2.add(especialidad3);
        TipoProblema tipo2 = new TipoProblema("Error Desconocido", "Pantalla en negro", 124,especialidadesDelTipo2);

        List<Especialidad> especialidadesDelTipo3 = new ArrayList<>();
        especialidadesDelTipo3.add(especialidad4);
        especialidadesDelTipo3.add(especialidad5);
        TipoProblema tipo3 = new TipoProblema("Error Desconocido", "Pantalla en negro", 124,especialidadesDelTipo3);

        List<TipoProblema> problemasDeLinux = new ArrayList<>();
        problemasDeLinux.add(tipo2);
        problemasDeLinux.add(tipo2);
        Servicio Linux = new Servicio("Linux", "", problemasDeLinux);

        List<TipoProblema> problemasDeWindows = new ArrayList<>();
        problemasDeWindows.add(tipo3);
        Servicio Windows = new Servicio("Windows", "", problemasDeWindows);

        Cliente Juan = new Cliente("1111111","76123761235");
        Juan.agregarServicio(Windows);
        Juan.agregarServicio(Linux);

        Juan.notificarIncidente(Juan.getServicios().get(1));

        */





    }

    public static void cargarDatosDB(){

        EspecialidadRepositorio repoEspecialidad = new EspecialidadRepositorio();

        Especialidad especialidad1 = new Especialidad("Desarrollo de BackEnd", "");
        Especialidad especialidad2 = new Especialidad("Desarrollo de FrontEnd", "");
        Especialidad especialidad3 = new Especialidad("Ingenieria en Sistemas", "");
        Especialidad especialidad4 = new Especialidad("Solo Windows", "");
        Especialidad especialidad5 = new Especialidad("Limpiador de PS's", "");

        repoEspecialidad.guardarEspecialidad(especialidad1);
        repoEspecialidad.guardarEspecialidad(especialidad2);
        repoEspecialidad.guardarEspecialidad(especialidad3);
        repoEspecialidad.guardarEspecialidad(especialidad4);
        repoEspecialidad.guardarEspecialidad(especialidad5);


        repoEspecialidad.terminarConexion();


    }

    public static void obtenerDatosDB(){

        EspecialidadRepositorio repoEspecialidad = new EspecialidadRepositorio();

        repoEspecialidad.obtenerTodasLasEspecialidads().forEach(especialidad -> System.out.println(especialidad));

        repoEspecialidad.terminarConexion();
    }

}
