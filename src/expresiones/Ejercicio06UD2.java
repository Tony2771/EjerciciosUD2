package expresiones;

import java.util.Scanner;

public class Ejercicio06UD2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //a)
        //int notaa,notab,notac;
        double notaa, notab, notac;
        System.out.println("Nota primera unidad didactica: ");
        notaa=in.nextDouble();
        System.out.println("Nota segunda unidad didactica: ");
        notab=in.nextDouble();
        System.out.println("Nota tercera unidad didactica: ");
        notac=in.nextDouble();
        double media;
        media = (notaa + notab + notac) / 3D;
        //System.out.println(media);
        if (media >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Suspenso");
        }
        //b)
        final double notaminima = 4.5;
        if (notaa >= notaminima && notab >= notaminima && notac >= notaminima){
            if (media >= notaminima){
                System.out.println("Aprovado");
            }else
                System.out.println("Suspenso");
        }else
            System.out.println("Suspenso");
        //c)
        boolean practicas=true;
        if(practicas==true){
            if (notaa >= notaminima && notab >= notaminima && notac >= notaminima){
                if (media >= notaminima){
                    System.out.println("Aprovado");
                }else
                    System.out.println("Suspenso");
            }else
                System.out.println("Suspenso");
        }else
            System.out.println("Suspenso");
        //d)
        media*=0.8;
        //System.out.println(media);
        double notaPracticas;
        System.out.println("Nota practicas: ");
        notaPracticas=in.nextDouble();
        notaPracticas*=0.2;
        //System.out.println(notaPracticas);
        double suma= media+notaPracticas;
        if(suma>4.5)
            System.out.println("Aprovado");
        else
            System.out.println("Suspenso");
    }
            

}
