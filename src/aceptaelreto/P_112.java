package aceptaelreto;

import java.util.Scanner;

public class P_112 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia, velocidadMax;
        double multa, operacion,tiempo;

        while (true) {
            distancia = in.nextInt();
            velocidadMax = in.nextInt();
            tiempo = in.nextInt();

            if (distancia == 0 && velocidadMax == 0 && tiempo == 0) {
                break;
            }
            if (distancia <= 0 || velocidadMax <= 0 || tiempo <= 0) {
                System.out.println("ERROR");
                continue;
            }

            operacion = distancia / tiempo;//Hallamos los m/s.
            operacion *= 3.6D; //Convertimos los m/s en km/h.
            multa = velocidadMax * 1.2D;

            if (operacion < velocidadMax) {
                System.out.println("OK");
            } else if (operacion < multa) {
                System.out.println("MULTA");
            } else {
                System.out.println("PUNTOS");
            }
        }
    }
}
