package estructurasrepetitivas;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroTerminos;
        int termino=1;
        System.out.println("Dime numero de terminos: ");
        numeroTerminos=in.nextInt();
        
        
        for (int i = 0; i < numeroTerminos -1; i++) {
            System.out.print(termino + ",");
            termino*=-2;
        }
        if(numeroTerminos>0)
            System.out.println(termino);
    }
}