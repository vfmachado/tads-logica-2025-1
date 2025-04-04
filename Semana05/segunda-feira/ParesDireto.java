public class ParesDireto {
    public static void main(String[] args) {
        
        int pares = 2;

        while (pares <= 20) {
            System.out.println(pares);
            pares = pares + 2;
        }

        // 1 ... 20
        // 2
        // 2 <= 20 ? SIM
        // 2 + 2 = 4
        // 4 <= 20? SIM
        // 6 <= 20? SIM
        // 20 <= 20? SIM
        // 22 <= 20? nao ... parei o laço
        // SAIDA 
        // 2 4 6 ... 20

    }
}
