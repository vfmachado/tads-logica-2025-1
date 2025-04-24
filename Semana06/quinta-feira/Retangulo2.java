public class Retangulo2 {
    public static void main(String[] args) {
        
        int colunas = 5;
        int linhas = 5;

        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                System.out.print("*  "); 
            }
            System.out.println();
        }
    }
}
