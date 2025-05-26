import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double n = 10000000;
        double soma = 0;
        double sinal = 1;
        double denominador = 1;

        for (int i = 1; i <= n; i++) {
            soma = soma + sinal * 1.0/denominador;
            sinal = sinal * -1;
            denominador = denominador + 2;
        }
        
        soma = soma * 4;
        System.out.println("PI " + soma);

    }
}