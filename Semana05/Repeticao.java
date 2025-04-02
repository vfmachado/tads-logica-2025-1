public class Repeticao {
    public static void main(String[] args) {
        // FACA UM PROGRAMA QUE MOSTRE E E SOME TODOS OS NUMEROS DE 1 A 10

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        // System.out.println(6);
        // System.out.println(7);
        // System.out.println(8);
        // System.out.println(9);
        // System.out.println(10);
        
        // VAMOS UTILIZAR UMA ESTRUTURA DE REPETICAO PARA FORÇAR A REPETICAO DE DETERMINADO BLOCO DE CODIGO
        /*
        enquanto (valor logico) {
            // bloco que vai ser repetido
        }
        
        while (valorLogico) {
        }
         */ 

        int numero = 0;
        while (numero < 10) {
            numero = numero+1;
            System.out.println("DENTRO DA REPETICAO " + numero);
        }

    }
}