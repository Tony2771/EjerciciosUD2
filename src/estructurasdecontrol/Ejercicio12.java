package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de kilometros: ");
        final int FIJO=30;
        int kilometros=in.nextInt();
        double importe;
        
        if (kilometros<=300)
            importe=FIJO;
        else if (kilometros<=1000)
            importe= (kilometros-300)*0.2 + FIJO;
        else
            importe=700*0.2 + (kilometros-1000)*0.15 + FIJO;
        
        System.out.println(importe);
    }

}