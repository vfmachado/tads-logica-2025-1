public class Exercicios {
    public static void main(String[] args) {

        // 1. OS NUMEROS DE 20 A 10
        for (int i = 20 ;  i >= 10  ; i = i - 1 /* i-- */  ) {
            System.out.println(i);
        }

        // 2. OS NUMEROS PARES DE 100 A 120
        for (int i = 100; i <= 120; i = i + 2) {
            System.out.println(i);
        }

        // 3. OS DIVISORES PARES DE UM NUMERO N
        int N = 100;
        for (int i = 2; i <= N; i = i + 2) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        // 4. OS DIVISORES IMPARES DE UM NUMERO N
        // 5. A SOMA DOS NUMEROS DE 1 A 10 (55)
        // 6. O FATORIAL DE UM NUMERO N (5! = 120, 6! = 720)

    }   
}
