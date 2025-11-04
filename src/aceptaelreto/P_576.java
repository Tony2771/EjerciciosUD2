package aceptaelreto;

import java.util.Scanner;

public class P_576 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Segundos que necesita el padre de Mafalda para leer una definición
        int numSegundos, casos, horas, minutos, segundos, suma;

        while ((numSegundos = in.nextInt()) != 0) {
            suma = 0;
            
            while ((casos = in.nextInt()) != 0) 
                suma += casos;
            
            suma *= numSegundos;
            horas = suma / 3600;
            minutos = suma % 3600 / 60;
            segundos = suma % 3600 % 60;
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
    }
}
