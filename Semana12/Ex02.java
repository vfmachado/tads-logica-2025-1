import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int idade;
        int soma = 0, quantidade = 0, maior = 0, menor = 9999;

        while (true) {
            idade = in.nextInt();
            if (idade == 0)  break;

            quantidade++;
            soma = soma + idade;

            if (quantidade == 1) {
                maior = idade;
                menor = idade;
            }

            if (idade >  maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }
        } 

        float media = (float)soma / quantidade;
        System.out.println("media " +media);
        System.out.println("menor " + menor);
        System.out.println("maior " + maior);
    }
}