import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        for (int n = 0; n <= 1000; n++) {
            int soma = 0;
            int div = 1;

            for (div = 1; div < n; div++) {
                if (n % div == 0) {
                    soma = soma + div;
                }
            }
            if (soma == n) {
                System.out.println(n + " eh perfeito ");
            }
        }

    }
}