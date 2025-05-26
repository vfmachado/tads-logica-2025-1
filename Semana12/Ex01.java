import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int valor = 0;

        while (valor < 1 || valor > 10) {
            valor = in.nextInt();
        }

        System.out.println(valor);


    }
}