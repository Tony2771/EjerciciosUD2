package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primero,segundo,suma;
        suma=0;
        System.out.println("Dime 2 numeros: ");
        primero=in.nextInt();
        segundo=in.nextInt();
        
        if(primero>segundo){
            int temporal=primero;
            primero=segundo;
            segundo=temporal;
        }
        
        if (primero%2!=0)
            primero++;
        
        for (int i = primero; i <= segundo; i+=2) {
            suma+=i;
        }
        
        System.out.println("La suma es: ");
        System.out.println(suma);
        
    }

}