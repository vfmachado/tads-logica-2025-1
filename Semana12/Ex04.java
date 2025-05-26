import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double soma = 0;
        double x = 0.5;
        int n = 5000000;
        double sinal = 1;

        for (int i = 1; i <= n; i++) {
            
            float denominador = i;
            // System.out.println("sinal " + sinal);
            // System.out.println("numerador " + x);
            // System.out.println("denominador " + denominador);

            soma = soma + sinal * x / denominador;

            x = x * x;
            sinal = sinal * -1;
        }

        System.out.println("SOMA " + soma);


    }
}