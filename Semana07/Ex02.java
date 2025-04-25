import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int an = in.nextInt();
        int razao = in.nextInt();

        while (a1 != 0 && an != 0 && razao != 0) {
            int soma = 0;

            for (int i = a1; i <= an; i = i + razao) {
                System.out.println(i);
                soma = soma + i;
            }

            System.out.println("SOMA " + soma);

            a1 = in.nextInt();
            an = in.nextInt();
            razao = in.nextInt();
        }
    }
}
