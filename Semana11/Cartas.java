import java.util.Random;
import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroPartidas = in.nextInt();

        for (int i = 0; i < numeroPartidas; i++) {
            float somaA = 0;
            float somaB = 0;

            int a1, a2;

            int v1, v2;

            System.out.print("CARTA A ");
            v1 = in.nextInt();
            v2 = in.nextInt();
            somaA = (v1 + v2)/2.0f;
            a1 = aleatorio.nextInt(6) + 1;

            System.out.print("CARTA B ");
            v1 = in.nextInt();
            v2 = in.nextInt();
            somaB = (v1 + v2)/2.0f;
            a2 = aleatorio.nextInt(6) + 1;

            System.out.println("CARTA A " + somaA + " + " + a1);
            System.out.println("CARTA B " + somaB  + " + " + a2);

            if (somaA + a1 > somaB + a2) {
                System.out.println("A VENCEU");
            } else if (somaA + a1 < somaB + a2) {
                System.out.println("B VENCEU");
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}
