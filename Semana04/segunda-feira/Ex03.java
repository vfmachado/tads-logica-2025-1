import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        /*
         
            11 % 3 = 2
            11/3 = 3 e sobra 2

            numero é par ou qualquer outro de divisao, basta verificar se o resto da divisao é igual a zero

            6 % 2 = 0  => 6 é par
            7 % 2 = 1   => 7 é impar
         */

         if (numero % 2 == 0) {
            System.out.println("PAR");
         } else {
            System.out.println("IMPAR");
         }

         if (numero % 5 == 0) {
            System.out.println(" e divisvel por 5");
         }
    }
}
