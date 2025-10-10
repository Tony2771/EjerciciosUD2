package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unidades;
        double resultado;
        
        System.out.println("Numero de unidades: ");
        unidades=in.nextInt();

        if (unidades >= 100) {
            System.out.println("Descuento del 40%");
            resultado = unidades * 0.6;
            System.out.println("Precio final de " + resultado + "€");
        } else if (unidades < 100 && unidades >= 25) {
            System.out.println("Descuento del 20%");
            resultado = unidades * 0.8;
            System.out.println("Precio final de " + resultado + "€");
        } else if (unidades >= 10 && unidades < 25) {
            System.out.println("Descuento del 10%");
            resultado = unidades * 0.9;
            System.out.println("Precio final de " + resultado + "€");
        } else
            System.out.println("No hay descuento");
        
    }
}
