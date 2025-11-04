package aceptaelreto;

import java.util.Scanner;

public class P_471 {

    public static void main(String[] args) {
        final int GRADOS;
        Scanner in = new Scanner(System.in);
        int numeroCasos = in.nextInt();
        int inicio,pinchazo;

        while(numeroCasos-- >0){
            inicio=in.nextInt();
            pinchazo=in.nextInt();
            
            pinchazo-=inicio;
            if(pinchazo<0)
                pinchazo+=360;
            
            if (pinchazo==0 || pinchazo==180)
                System.out.println("DA IGUAL");
            else if(pinchazo<180)
                System.out.println("ASCENDENTE");
            else
                System.out.println("DESCENDENTE");
        }
    }
}
