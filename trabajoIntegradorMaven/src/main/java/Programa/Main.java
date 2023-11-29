package Programa;

public class Main {
    public static void main(String[] args) {

    datosPruebas();










        //    Ejemplo de forEach
//    // forEach <-> Lambda Expression
//    // ref: https://www.arquitecturajava.com/java-8-lambda-y-foreach-ii/
//    public void listarServiciosEmpresa() {
//        serviciosEmpresa.forEach((Servicio servicio) -> System.out.println(servicio.getNombreServicio()));
//    }







    }



    public static void datosPruebas(){

        Tecnico tec1 = new Tecnico(){};
        Cliente cliente1 = new Cliente();

        tec1.setDni(44721215);

        cliente1.setRazonSocial("S");
        cliente1.setCUIT("2323-223-23232");

        System.out.println("DNI tecnico " + tec1.getDni() + " cliente " + cliente1.getRazonSocial());
        cliente1.agregarServicio(new Servicio("nombreObligatorioServicioDebidoAFinalLombok"));


        Servicio soporteMacOs = new Servicio("Soporte MacOS");
        Servicio soporteWindows = new Servicio("Soporte Windows");
        Servicio soporteLinux = new Servicio("Soporte Linux");











    }



}