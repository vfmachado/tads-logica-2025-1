import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1  10  50
        // 78       1 de 50     2 de 10   e 8 de 1

        int valor = in.nextInt();
        int n50, n10, n1;
        int resto;

        n50 = valor / 50;
        // como que cheogo no resto (o que nao foi sacado?)
        resto = valor % 50; // 78 / 50 sobra 28

        n10 = resto / 10;
        resto = resto % 10;

        n1 = resto;

        System.out.println("SAO NECESSARIAS");
        System.out.println(n50  + " notas de 50");
        System.out.println(n10  + " notas de 10");
        System.out.println(n1  + " notas de 1");

    }
}
