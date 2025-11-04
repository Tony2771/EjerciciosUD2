package aceptaelreto;

import java.util.Scanner;

public class P_112 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia, velocidadMax, tiempo;
        double multa, operacion;

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

            operacion = distancia / tiempo;
            operacion *= 3.6D;
            multa = velocidadMax * 0.8D;

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
