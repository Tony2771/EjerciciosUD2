package aceptaelreto;

import java.util.Scanner;

public class P_529 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        String entrada;
        int actual, maximo;
        in.nextLine();//Vaciamos el enter

        while (casos-- > 0) {
            entrada = in.nextLine();
            actual = maximo = 0;

            for (int i = 0; i < entrada.length(); i++) {

                if (entrada.charAt(i) == 'I') {
                    actual++;
                    if (actual > maximo) 
                        maximo = actual;
                } else if (actual>0)
                    actual--;
                else
                    maximo++;
            }
            System.out.println(maximo);
        }
    }
}
