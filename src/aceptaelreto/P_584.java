package aceptaelreto;

import java.util.Scanner;

public class P_584 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCasos=in.nextInt();
        int vidaUtil,numeroencendidos,horasEncendida,operacion;
        for (int i = 0; i < numeroCasos; i++) {
            vidaUtil=in.nextInt();
            numeroencendidos=in.nextInt();
            horasEncendida=in.nextInt();
            
            operacion=numeroencendidos*horasEncendida;
            
            if(operacion>vidaUtil)
                System.out.println("HORAS");
            else if(operacion<vidaUtil)
                System.out.println("ENCENDIDOS");
            else
                System.out.println("AMBAS");
        }
    }
}