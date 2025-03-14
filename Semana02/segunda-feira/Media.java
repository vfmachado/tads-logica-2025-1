import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, soma;

        System.out.println("Informe 2 valores");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        soma = (n1 + n2)/2;
        System.out.println("MEDIA = " + soma);
    }
}

