import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vetor;
        
        char [][] mat = new char[3][3];

        // inicializando uma matriz
        // i = linha
        // j = coluna
        // primeiro percorremos todas as linhas
        // mat.length é a quantidade de linhas da minha triz
        for (int i = 0; i < mat.length; i++) {
            // para cada linha eu percorro todas as colunas
            // math[i].length -> quantidade de colunas de cada linha
            for (int j = 0; j < mat[i].length; j++) {
                // sempre o acesso é através da combinação linha,coluna
                mat[i][j] = '-';
            }
        }

        char jogador = 'O';
        while (true) {
            // mostrar uma matriz
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    // as colunas eu quero que apareçam uma ao lado da outra ... entao removemos o LN do print e concatenamos um espaço
                    System.out.print(mat[i][j] +  " ");
                }
                // apos printar todas as colunas de uma linha, quebra de linha
                System.out.println();
            }

            System.out.println("Escolha uma linha e uma coluna (0 a 2)");
            int linha = in.nextInt();
            int coluna = in.nextInt();
            // a cada jogada, controlar para ser O ou X (vogal o maiusculo)
            mat[linha][coluna] = jogador;
            
            // verificar se o jogador ganhou
            // supondo que o jogador escolheu a linha 1 e coluna 0
            // verificar todos da linha 1
            // verificar todos da coluna 0
            if (
            mat[linha][0] == mat[linha][1] &&  mat[linha][0] == mat[linha][2]) {
                System.out.println("JOGADOR GANHOU NA LINHA");
                break;
            }

            if (
                mat[0][coluna] == mat[1][coluna] && 
                mat[0][coluna] == mat[2][coluna]
            ) {
                System.out.println("GANHOU NA COLUNA");
                break;
            }

            // diagonais
            // se i == j => verificar diagonal principal
            // se i + j = 2 (tam -1) => verificar diagonal secundaria

            if (jogador == 'O') {
                jogador = 'X';
            } else {
                jogador = 'O';
            }
        }

    }

}