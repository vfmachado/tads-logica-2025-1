//FAÇA UM PROGRAMA QUE DADO DOIS NUMEROS, INDIQUE QUAL O MAIOR

import java.util.Scanner;

public class Maior {
    // PQ O CRIADOR DO JAVA DETERMINOU QUE O METODO MAIN TEM ESSA ASSINATURA
    public static void main(String[] args) {
        // DECLARACAO E INICIALIZAÇAO DO SCANNER
        Scanner in = new Scanner(System.in);    
        //      ^ PQ EU QUIS        ^  de onde vem essa vem a entrada ... neste caso, terminal

        // declaracao de variavel
        // o espaço é reservado para 2 inteiros
        int n1, n2;

        // ENTRADA DE DADOS
        System.out.println("Informe 2 numeros");
        n1 = in.nextInt();
        n2 = in.nextInt();

        // PROCESSAMENTO e SAIDA
        if (n1 > n2) {
            System.out.println(n1 + " > " + n2);
        }
        if (n2 > n1) {
            System.out.println(n2 + " > " + n1);
        }
        
    }   
}