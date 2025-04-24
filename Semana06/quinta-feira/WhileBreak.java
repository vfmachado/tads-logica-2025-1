import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // faca um programa que some os valores digitados pelo usuário, até que seja digitado um valor negativo. Este nao deve entrar na soma, conte o total de valores digitados.
        int soma = 0, quantidade = 0;
        int digitado = 0;
        // a ideia para nao repetir a logica e possivelmente melhorar a disposicao do meu laco de repeticao, é utilizar um break para parar
        while (true) {  // laco infinto
            digitado = in.nextInt();
            if (digitado < 0) break;    // break que "PARA" o laco quando digitado for menor que zero
            
            soma = soma + digitado;
            quantidade++;
            
        }

        System.out.println("SOMA " + soma);
        System.out.println("QUANTIDADE " + quantidade);

    }
}
