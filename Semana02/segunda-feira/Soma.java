// SCANNER serve para transformar entradas de dados
import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {
        // Cria uma instancia do Scanner chamada in
        // o nome "in" quem dá é voce!
        // eu (vini) uso in de input
        Scanner in = new Scanner(System.in);
        //  declaracao         inicializacao
        
        // declaracao de variavel
        int n1, n2, sum;
        int soma;

        System.out.println("Informe 2 valores");
        n1 = in.nextInt();
        n2 = in.nextInt();

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n1 + n2 = " + (n1 +n2));
        soma = n1 + n2;
        System.out.println("SOMA = " + soma);
    }
}

