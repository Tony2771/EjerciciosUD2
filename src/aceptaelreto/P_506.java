package aceptaelreto;

import java.util.Scanner;

public class P_506 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos, max, min;
        casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            max = in.nextInt();
            in.next();//Se vacia la barra
            min = in.nextInt();
            if (max >= min) 
                System.out.println("BIEN");
             else 
                System.out.println("MAL");
        }
    }
}
