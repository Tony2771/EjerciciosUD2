package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int terminos = in.nextInt();
        double suma = 0;

        for (int i = 1; i <= terminos; i++) {
            //No hay que convertir a double porque la clase Math.pow ya los
            //cambia a double.
            suma += i/Math.pow(2,i);
        }

        System.out.println(suma);
    }

}
