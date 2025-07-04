import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [][] M = new int[5][5];

        while (true) {

            System.out.println("\n\n####");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("\n####\n\n");
            

            // O USUARIO ESCOLHE UMA LINHA E PROGRAMA PERMITE QUE O USUARIO DIGITE OS NUMEROS DAQUELA LINHA
            // LINHA:
            // PARA CADA COLUNA DA LINHA INFORMADA, INFORMAR UM VALOR
            System.out.println("ESCOLHA UMA LINHA");
            int linha = in.nextInt();

            System.out.println("Informe os valores para a linha " + linha);
            // M[linha][0] = in.nextInt();
            // ...
            // M[linha][4] = in.nextInt();
            for (int col = 0; col < M.length; col++) {
                M[linha][col] = in.nextInt();
            }

            // O USUARIO ESCOLHE UM NUMERO DE COLUNA E UM MULTIPLICADOR X, E CADA ITEM DA COLUNA É MULTIPLICADO POR X
            System.out.println("Escolha coluna e o multiplicador");
            int coluna = in.nextInt();
            int x = in.nextInt();

            for (int lin = 0; lin < 5; lin++) {
                M[lin][coluna] = M[lin][coluna] * x;
            }


            System.out.println("\n\n####");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("\n####\n\n");
            
            // O USUARIO ESCOLHE 2 LINHAS E TROCA OS VALORES DAS LINHAS
                // EX LIN 1 E 2    => A 1 VIRA A 2 E A 2 VIRA A 1
            System.out.println("escolha duas linhas");
            int r1 = in.nextInt();
            int r2 = in.nextInt();

            // como eu troco o valor de duas variaveis, a e b por exemplo
            // int c = a;
            // a = b;
            // b = c;
            
            for (int col = 0; col < M.length; col++) {
                int c = M[r1][col];
                M[r1][col] = M[r2][col];
                M[r2][col] = c;
            }




            // MOSTRA A TRANSPOSTA DA MATRIZ (LINHA VIRA COLUNA)

            // TRANSFORME CADA UMA DAS TAREFAS ACIMA EM UMA OPCAO QUE O USUARIO ESCOLHE FAZER  (IF-ELSE  OU SWITCH CASE)

            // FACA UMA OPCAO PARA VERIFICAR SE DUAS LINHAS ESCOLHIDAS PELO USUARIO TEM A MESMA SOMA

            // FACA UMA OPCAO QUE DADO UM NUMERO X ESCOLHIDO PELO USUARIO, VERIFIQUE AS SOMAS NAS LINHAS E COLUNAS QUE RESULTEM EM X 
        }
    }
}
