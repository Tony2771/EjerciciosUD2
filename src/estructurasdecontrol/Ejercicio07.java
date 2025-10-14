package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte horas, minutos;

        System.out.println("Escribe una hora");
        horas = in.nextByte();
        System.out.println("Escribe los minutos");
        minutos = in.nextByte();

        if (horas > 12) {
            horas -= 12;
            System.out.printf("%02d:%02d", horas, minutos);
            System.out.println(" PM");
        } else{
            System.out.printf("%02d:%02d", horas, minutos);
            System.out.println(" AM");
        }
    }

}
