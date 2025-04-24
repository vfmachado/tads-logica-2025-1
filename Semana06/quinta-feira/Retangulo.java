public class Retangulo {
    public static void main(String[] args) {
        
        // LARGURA E ALTURA DE UM RETANGULO, DESENHAR COM * 
        // 5   3
        /*

            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *

         */

        int colunas = 5;
        int linhas = 3;

        // laco dentro de laco
        for (int lin = 0; lin < linhas; lin++) {
            // estrutura de repeticao
            //     inicializacao       valor_logico         passo
            //         1                  2                   3
            for (int col = 0   ;    col < colunas   ;      col++) {
                // bloco - 4
                System.out.print("*  ");
                
            }
            // 1  2  4     3   2  4     3  2  4    3  2 4   3   2 (falso)
            System.out.println();
        }


        // int col = 0;
        // while (col < colunas) {
        //     System.out.print("*  ");
        //     col++;
        // }

    }
}
