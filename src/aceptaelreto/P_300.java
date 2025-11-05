package aceptaelreto;

import java.util.Scanner;

public class P_300 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=in.nextInt();
        String sustantivo;
        in.nextLine();
        boolean letraA,letraE,letraI,letraO,letraU;
        
        while(casos-- >0){
            
            sustantivo=in.nextLine();
            letraA=letraE=letraI=letraO=letraU=false;
            
            for (int i = 0; i < sustantivo.length(); i++) {
                
                if (sustantivo.charAt(i)=='a')
                    letraA=true;
                else if (sustantivo.charAt(i)=='e')
                    letraE=true;
                else if (sustantivo.charAt(i)=='i')
                    letraI=true;
                else if (sustantivo.charAt(i)=='o')
                    letraO=true;
                else if (sustantivo.charAt(i)=='u')
                    letraU=true;
            }
            if (letraA&&letraE&&letraI&&letraO&&letraU)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}