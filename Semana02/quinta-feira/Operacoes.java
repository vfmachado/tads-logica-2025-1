import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // FAÇA UM PROGRAMA QUE LEIA UM NUMERO INTEIRO E IMPRIMA
        int n, soma, quad, antecessor, div2, div3;
        n = in.nextInt();
        // A SOMA DELE COM ELE MESMO
        soma = n + n;
        // O NUMERO AO QUADRADO
        quad = n * n;
        // SEU ANTECESSOR
        antecessor = n - 1;
        // RESULTADO DA DIVISAO POR 2
        div2 = n/2;
        // RESULTADO DA DIVISAO POR 3
        div3 = n/3;

        System.out.println("Soma " + soma);
        System.out.println("Quad " + quad);
        System.out.println("ante " + antecessor);
        System.out.println("div2 " + div2);
        System.out.println("div3 " + div3);
    }
}