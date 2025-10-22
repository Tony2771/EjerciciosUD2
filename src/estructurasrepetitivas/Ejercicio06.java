package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int terminos = in.nextInt();
        double numerador=0;
        int denominador=2;
        double suma=0;
        
        for (int i = 0; i < terminos; i++) {
            suma+=numerador/denominador;
            
            numerador+=5;
            denominador*=3;
        }
        
        System.out.println(suma);
    }

}
