import java.util.Scanner;
public class MaiorIdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        int idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("MAIOR DE IDADE");
        } else { // SABENDO QUE A CONDICAO É EXATAMENTE O OPOSTO DA ANTERIOR, NAO PRECISO DE UMA NOVA CONDICAO.. PODEMOS UTILIZAR A PALAVRA "SENAO"
            System.out.println("MENOR DE IDADE");
        }
    }
}