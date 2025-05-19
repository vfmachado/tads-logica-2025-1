public class L06Ex04 {
    public static void main(String[] args) {
        
        // soma
        // fatorial
        // divisao
        float soma = 1;
        float fatorial = 1;  // 0! = 1   3! = 3 x 2 x 1
                                    //   4! = 4 x 3 x 2 x 1
                                    //   5! = 5 x 4 x 3 x 2 x 1 
        
        // fatorial =  1
        // i = 2
        for (int i = 1; i <= 5; i++) {
            fatorial = fatorial * i;    // 1 * 1 = 1
            float fracao = 1 / fatorial;    // 1 / 1 = 1
            soma = soma + fracao;
        }

        System.out.println("SOMA " + soma);
    }
}
