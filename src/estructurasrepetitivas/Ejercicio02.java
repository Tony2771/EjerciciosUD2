package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        final int MAX=5;
        Scanner in = new Scanner(System.in);
        int n;
        double suma = 0;
        double media;
        
        for (int i = 1; i <= MAX; i++) {
            System.out.print("Teclea el número " + i + ": ");
            n = in.nextInt();
            
            suma += n;
        }
        
        media = suma / MAX;
        System.out.println("Media: " + media);
    }

}