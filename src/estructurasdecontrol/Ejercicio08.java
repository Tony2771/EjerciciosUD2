package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Escribe a: ");
        a=in.nextInt();
        System.out.println("Escribe b: ");
        b=in.nextInt();
        System.out.println("Escribe c: ");
        c=in.nextInt();
        System.out.println("Escribe d: ");
        d=in.nextInt();
        
        int centena=a*10+b;
        
        if(c>=5)
            centena++;
        
        System.out.println(centena + "00");
    }

}