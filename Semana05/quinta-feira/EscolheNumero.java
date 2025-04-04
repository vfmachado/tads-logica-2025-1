import java.util.Random;
import java.util.Scanner;

public class EscolheNumero {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int numero;
        int aleatorio = random.nextInt(20) + 1;

        System.out.println("informe um numero");
        numero = in.nextInt();
        // 1. AJUSTE O TRECHO A SEGUIR PARA QUE O USUARIO FIQUE INFORMANDO NOVOS NUMEROS ATÉ QUE ELE ACERTE O VALOR SORTEADO
        // 2. CONTE QUANTAS TENTATIVAS FORAM NECESSARIAS
        // 3. DE UMA DICA AO USUARIO (MAIOR / MENOR)
        // 4. INCLUA UM SISTEMA DE 3 TENTATIVAS APENAS
        int tentativas = 1;
        while (numero != aleatorio) {
           System.out.print("ERROU, informe um novo valor ");
           if (numero > aleatorio) {
               System.out.println("menor");
           } else {
               System.out.println("maior");
           }
           tentativas++;
           numero = in.nextInt();
        }

        System.out.println("VC ACERTOU!");
        System.out.println("Foram necessarias " + tentativas + " tentativas");
    }    
}
