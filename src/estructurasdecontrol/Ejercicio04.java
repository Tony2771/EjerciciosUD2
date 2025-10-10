package estructurasdecontrol;

public class Ejercicio04 {

    public static void main(String[] args) {
       int numero1,numero2,numero3,numero4,menor;
       numero1=3;
       numero2=5;
       numero3=8;
       numero4=1;
       
       if(numero1<numero2)
           menor=numero1;
       else
           menor=numero2;
       if (numero3<menor)
           menor=numero3;
       if (numero4<menor)
           menor=numero4;
       
        System.out.println(menor);
       
    }

}