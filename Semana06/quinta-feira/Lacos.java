public class Lacos {
    public static void main(String[] args) {
        /* DECOMPOSICAO DO 120 EM FATORES PRIMOS
           120 | 2 
            60 | 2 
            30 | 2
            15 | 3
            5  | 5
            1 
        // 2 2 2 3 5 5
        */
        int n = 120;
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                System.out.println(divisor);
                n = n / divisor;
            } else {
                divisor++;
            }
        }
    }
}