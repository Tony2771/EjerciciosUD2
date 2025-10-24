package aceptaelreto;

import java.util.Scanner;

public class P_191 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos = in.nextInt();
        int compartimentos, capacidad, diferencia, suma;

        for (int i = 0; i < numeroCasos; i++) {
            suma = 0;
            compartimentos = in.nextInt();
            capacidad = in.nextInt();
            diferencia = in.nextInt();
            for (int j = 0; j < compartimentos; j++) {
                suma += capacidad;
                capacidad = capacidad - diferencia;
            }
            System.out.println(suma);
        }
    }
}
