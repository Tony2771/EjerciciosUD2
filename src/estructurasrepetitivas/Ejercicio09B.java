package estructurasrepetitivas;

public class Ejercicio09B {

    public static void main(String[] args) {
        long factorial;

        for (int n = 1; n <= 20; n++) {
            factorial=1;
            for (int i = n; i >1; i--) {
                factorial*=i;
            }
            System.out.println(n + "! =" + factorial);
        }
    }
}
