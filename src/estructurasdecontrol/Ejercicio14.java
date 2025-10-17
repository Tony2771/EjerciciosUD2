package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte dia;
        boolean clienteFrecuente;
        String frecuente;
        double precio;
        
        System.out.println("Indique el dia de la semana: ");
        dia=in.nextByte();
        
        System.out.println("¿Es un cliente frecuente?");
        frecuente=in.next();//Lee el siguiente texto. Tiene que estar delimitado por un espacio o por un Enter.
        
        clienteFrecuente=frecuente.toUpperCase().charAt(0)=='S';
        
        precio=switch(dia){
            case 1,2,3,4,5 -> 12;
            default -> 15;
        };
        
        if(clienteFrecuente)
            precio*=0.85;//Rebaja del 15%
        
        System.out.println("Precio: " + precio + "€");
    }

}