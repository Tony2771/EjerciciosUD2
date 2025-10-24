package aceptaelreto;

import java.util.Scanner;

public class P_216 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos=in.nextInt();
        int horas;
        int minutos;
        int segundos;
        int goteras;
        
        for (int i = 0; i < numeroCasos; i++) {
            goteras=in.nextInt();
            horas=goteras/3600;
            minutos=goteras%3600/60;
            segundos=goteras%60;
            System.out.printf("%02d:%02d:%02d\n", horas, minutos,segundos);
        }
    }
}