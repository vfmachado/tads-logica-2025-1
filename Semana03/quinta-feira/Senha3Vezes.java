// faça um programa que peça para o usuario escolher um numero de 0 a 10 e compare com um numero sorteado, considere 7 por enquanto..., caso o usuario erre, de a chance dele tentar novamente até 3 vezes. IFs e ELSEs irão rolar.
import java.util.Scanner;
import java.util.Random;
public class Senha3Vezes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        int sorteado = aleatorio.nextInt(11);   // 0 até 10
        int escolhido;

        System.out.println("Digite um numero de 0 a 10");
            escolhido = in.nextInt();

        if (escolhido == sorteado) {
            System.out.println("Parabens vc acertou");
        } else {
            System.out.println("Vc errou, tente novamente");
            if (escolhido < sorteado) {
                System.out.println("Tente maior");
            } else {
                System.out.println("Tente menor");
            }
            escolhido = in.nextInt();

            if (escolhido == sorteado) {
                System.out.println("Parabens vc acertou");
            } else {
                System.out.println("Vc errou, tente novamente");
                escolhido = in.nextInt();

                if (escolhido == sorteado) {
                    System.out.println("Parabens vc acertou");
                } else {
                    System.out.println("Tentativas esgotadas ... era " + sorteado);
                }
            }
        }

    }
}