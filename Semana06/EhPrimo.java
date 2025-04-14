public class EhPrimo {
    public static void main(String[] args) {
        
        int n = 53;
        int divisor = 1;
        int quantDivisores = 0;
        while (divisor <= n) {
            
            if (n % divisor == 0) {
                System.out.println("DIVISIVEL POR " + divisor);
                quantDivisores++;
            }
            divisor++;
        }

        System.out.println("O numero tem " + quantDivisores + " divisores");
        if (quantDivisores == 2) {
            System.out.println("ESSE NUMERO É PRIMO!");
        }
    };
}
