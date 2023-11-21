package Programa;

import lombok.Data;
import lombok.Setter;

public class Main {
    public static void main(String[] args) {

    Tecnico tec1 = new Tecnico(){

    };
    Cliente cliente1 = new Cliente();

    tec1.setDNI(44721215);
    cliente1.setRazonSocial("S");
    cliente1.setCUIT("2323-223-23232");

    System.out.println("DNI tecnico " + tec1.getDNI() + " cliente " + cliente1.getRazonSocial());
    cliente1.setServicios();
    }
}