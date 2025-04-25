import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);
            int valor, proximo;

            valor = in.nextInt();
            proximo = in.nextInt();

            while (proximo != 0) {

                if (valor % proximo == 0) {
                    System.out.println(proximo + " eh divisor de " + valor);
                } else if (proximo % valor == 0) {
                    System.out.println(proximo  + " é multiplo de " + valor);
                } else {
                    System.out.println(proximo + " nao eh nada de " + valor);
                }

                valor = proximo;
                proximo = in.nextInt();
            }
    }
}