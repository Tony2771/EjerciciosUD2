package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int terminos;
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;
        double suma=0;
        int n;
        
        System.out.println("Cuántos numeros se van a teclear?: ");
        terminos=in.nextInt();
        
        for (int i = 0; i < terminos; i++) {
            System.out.println("Número: ");
            n=in.nextInt();
            
            if (n>mayor)
                mayor=n;
            if(n<menor)
                menor=n;
            suma+=n;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Media= " + suma/terminos);
    }
}