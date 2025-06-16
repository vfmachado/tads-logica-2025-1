import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        
        int [] v1;
        int v2 [];

        v1 = new int[5];

        int [] a, b, c; // TODOS SAO VETORES
        int d, e, f []; // aqui só f é vetor

        // vetor ja inicializado
        int [] valores = { 10, 20, 30, 40, 50 };    
    
        // LER OS VALORES DE UM VETOR
        Scanner in = new Scanner(System.in);
        
        // precisamos de um laco para passar por todas as posicoes do meu vetor
        // a primeira posicao do vetor é 0
        // a ultima posicao é tamanho-1
        // TODO vetor tem um atributo .length => tamanho
        for (int posicao = 0; posicao < v1.length; posicao++) {
            v1[posicao] = in.nextInt();
        }

        for (int i = v1.length - 1; i >= 0 ; i--) {
            System.out.println("v1[" + i + "] = " + v1[i]);
        }
    }
}