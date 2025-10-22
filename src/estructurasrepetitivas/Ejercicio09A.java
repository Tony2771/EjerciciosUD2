package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio09A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número: ");
        byte numero = in.nextByte();
        long factorial=1;
        
        for (int i = 2; i <= numero; i++) {
            factorial*=i;
        }
        
        System.out.println(numero + "! = " + factorial);
    }

}