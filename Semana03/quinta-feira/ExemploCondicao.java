import java.util.Scanner;
public class ExemploCondicao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("informe sua idade");
        idade = in.nextInt();

        // se a idade é maior ou igual a 18
        boolean ehMaiorOuIgual = idade >= 18;
        if (ehMaiorOuIgual) {
            System.out.println("EH MAIOR DE IDADE " + ehMaiorOuIgual);
        }
        // se a idade é menor que 18
        if (idade < 18) {
            System.out.println("EH MENOR DE IDADE ");
        }


        // SE (VALOR LOGICO) {
            // BLOCO DE CODIGO
        //}
    }
}