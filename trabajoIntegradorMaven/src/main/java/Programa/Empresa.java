package Programa;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Empresa {

    private String nombre;

    ArrayList<Servicio> serviciosEmpresa = new ArrayList<>();

    //serviciosEmpresa.add();


    /*
    Servicio soporteMacOs = new Servicio();
    Servicio soporteWindows = new Servicio();
    Servicio soporteLinux = new Servicio();

     */



    public void agregarServicio(Servicio servicioAAgregar){
        serviciosEmpresa.add(servicioAAgregar);
    }


    // forEach <-> Lambda Expression
    // ref: https://www.arquitecturajava.com/java-8-lambda-y-foreach-ii/
    public void listarServiciosEmpresa() {
        serviciosEmpresa.forEach((Servicio servicio) -> System.out.println(servicio.getNombreServicio()));

        /*
        for ((serviciosEmpresa.size():
             ) {
            System.out.println(serviciosEmpresa.get(servicio).getNombreServicio());
        }
        forEach(serviciosEmpresa.size()){

        }
         */
    }



}
