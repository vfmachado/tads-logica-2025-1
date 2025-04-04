public class ParesComTeste {
    public static void main(String[] args) {
        
        int n = 1;

        while (n <= 20) {
            // se o resto da divisao por 2 for igual a zero, o numero é par
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

    }
}
