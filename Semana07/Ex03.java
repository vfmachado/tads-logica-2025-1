import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int quantidade = 0;
        int menor = 0; 
        int maior = 0;
        float media = 0;
        
        int idade = in.nextInt();

        while (idade != 0) {
            quantidade++;
            media = media + idade;

            if (quantidade == 1) {
                maior = idade;
                menor = idade;
            }

            if (idade > maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }

            idade = in.nextInt();
        }

        media = media/quantidade;

        System.out.println("MAIOR " + maior);
        System.out.println("MENOR " + menor);
        System.out.println("QUANTIDADE " + quantidade);
        System.out.println("MEDIA " + media);

    }
}
