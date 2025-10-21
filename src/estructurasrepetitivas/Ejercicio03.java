package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int max;
        double suma = 0;
        double media;
        
        
        System.out.println("Cuantos numeros va a teclear? ");
        max=in.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.print("Teclea el número " + i + ": ");
            n = in.nextInt();

            suma += n;
        }

        media = suma / max;
        System.out.println("Media: " + media);
    }

}
