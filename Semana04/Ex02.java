import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade = in.nextInt();
        /*
            - Criança (0 a 12 anos)
            - Adolescente (13 a 17 anos)
            - Adulto (18 a 59 anos)
            - Idoso (60 anos ou mais)
         */
        if (idade <= 12) {
            System.out.println("crianca");
        }  else if (idade <= 17) {
            System.out.println("adolescente");
        } else if (idade <= 59) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
    }
}
