package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero=in.nextInt();
        if(numero!=0)
            if (numero%2==0)
            System.out.println("Es par");
            else
            System.out.println("Es impar");
        else
            System.out.println("Es 0");
    }

}