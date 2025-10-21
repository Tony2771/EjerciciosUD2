package aceptaelreto;

import java.util.Scanner;

public class P_355 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero=in.nextInt();
        int anno;
        
        
        for (int i = 0; i < numero; i++) {
            anno=in.nextInt();
            if ((anno%4==0)&&(anno%100!=0 || anno%400==0))
                System.out.println("29");
            else
                System.out.println("28");
        }
        
    }

}