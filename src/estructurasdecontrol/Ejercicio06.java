package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario_bruto;
        int numero_hijos;
        
        System.out.println("Introduce tu salario bruto: ");
        salario_bruto = in.nextDouble();
        
        System.out.println("Numero de hijos: ");
        numero_hijos=in.nextInt();
        
        if(numero_hijos<=2)
            System.out.println("Retencion del 20% por lo que tu salario neto es de " + (salario_bruto*0.8) + "€");
        else if(numero_hijos>=3&&numero_hijos<=5)
            System.out.println("Retencion del 15% por lo que tu salario neto es de " + (salario_bruto*0.85) + "€");
        else if(numero_hijos>=6&&numero_hijos<=7)
            System.out.println("Retencion del 10% por lo que tu salario neto es de " + (salario_bruto*0.9) + "€");
        else if (numero_hijos>=8&&numero_hijos<=9)
            System.out.println("Retencion del 5% por lo que tu salario neto es de " + (salario_bruto*0.95) + "€");
        else
            System.out.println("No tienes retenciones");
    }
}
