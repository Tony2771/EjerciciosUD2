package aceptaelreto;

import java.util.Scanner;

public class P_595 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos = in.nextInt();
        int problema;
        
        for (int i = 0; i < numeroCasos; i++) {
            problema=in.nextInt();
            problema/=100;
            System.out.println(problema);
        }
    }
}
