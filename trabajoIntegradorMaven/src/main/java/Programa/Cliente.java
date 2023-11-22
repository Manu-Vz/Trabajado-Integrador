package Programa;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
public class Cliente {
    private Incidente incidente;
    private String razonSocial;
    private String CUIT;
    private ArrayList<Servicio> servicios = new ArrayList<>();


    public void agregarServicio(Servicio servicio){

        servicios.add(servicio);

        /*
        Servicio SoporteMacOs = new Servicio();
        Servicio soporteWindows = new Servicio();
        Servicio soporteLinux = new Servicio();
         */

        //servicios.add(Soporr);

/*
        public void agregarPartido(Partido partido)
        {
            partidos.add(partido);
        }

 */

    }



}