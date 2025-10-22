package aceptaelreto;

import java.util.Scanner;

public class P_219 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos = in.nextInt();
        int numeroDecimos;
        int decimo;
        int suma;
        //Hcemos tantas iteraciones como casos de prueba tengamos.
        for (int i = 0; i < numeroCasos; i++) {
            suma = 0;
            numeroDecimos=in.nextInt();
            for (int j = 0; j < numeroDecimos; j++) {
                decimo=in.nextInt();
                if(decimo%2==0)
                    suma+=1;
            }
            System.out.println(suma);
        }
    }

}
