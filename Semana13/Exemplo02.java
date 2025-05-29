import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        int [] vetor;
        Scanner in = new Scanner(System.in);

        System.out.println("Usuario inimigo dos devs, qual o tamanho?");
        int tamanho = in.nextInt();

        vetor = new int[tamanho];

        // para cada posicao, vamos pedir para o usuario digitar um numero
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um valor para a posicao " + i);
            // vetor na posicao i recebe
            // vetor é a variavel
            // [i] na posicao i
            //  =  recebe
            vetor[i] = in.nextInt();
        }
        
        // 1. MOSTRE O VETOR EM ORDEM INVERSA
        // 2. CALCULE A MEDIA DOS VALORES DO VETOR
        // 3. INDIQUE A POSICAO QUE POSSUI O MENOR VALOR
        // 4. PERGUNTE AO USUARIO UM VALOR E VERIFIQUE SE ELE ESTA PRESENTE NO VETOR, INDICANDO A POSICAO CASO ESTEJA.

        

    }
}
