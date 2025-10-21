package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        System.out.println("Dime un numero: ");
        int k = in.nextInt();
        
        for (int i = 1; i < 100; i++) {
            k+=i;
            suma=1/k;
            suma+=suma;
        }
        
        System.out.println(suma);
    }

}
