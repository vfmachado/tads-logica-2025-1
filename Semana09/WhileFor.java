public class WhileFor {
    public static void main(String[] args) {
        
        // ESTRUTURAS DE REPETICAO SERVEM PRA REPETIR UM BLOCO DE CODIGO

        // MOSTRAR OS NUMEROS DE 1 A 5000

        // inicializacao
        int cont = 0;
        // int i;  // indice / idx

        // while (teste logico)
        while (cont <= 20) {
            // bloco de codigo - dentro do bloco existe algo que torna o teste falso, para que a repetição seja encerrada
            if (cont % 2 == 0) {
                System.out.println(cont + " eh par");
            } else {
                System.out.println(cont + " eh impar");
            }
            cont++;
        }


        // UTILIZANDO FOR, NOS TEMOS NA MESMA LINHA AS 3 ETAPAS DO LACO DE REPETICAO
        // INICIALIZAO, TESTE LOGICO, PASSO
        //  1   2   4     3 2  4   3   2  4    3 2   4   3  2 (falso)
        //     1          2      3
        for (int i = 0; i < 10; i++) {
            // bloco 4
        }
    }
}
