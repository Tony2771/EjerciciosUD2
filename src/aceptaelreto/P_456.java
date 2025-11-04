package aceptaelreto;

import java.util.Scanner;

public class P_456 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos = in.nextInt();
        int alto,ancho,cuadraditos,necesarios,tabletas;
        
        for (int i = 0; i < numeroCasos; i++) {
            ancho=in.nextInt();
            alto=in.nextInt();
            cuadraditos=ancho*alto;
            necesarios=in.nextInt();
            
            if(cuadraditos<necesarios){
                tabletas=necesarios/cuadraditos;
                if(necesarios%cuadraditos==0)
                    System.out.println(tabletas);
                else
                    System.out.println(tabletas+1);
            }else
                System.out.println("1");
            }
        }
    }
