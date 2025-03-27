import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            System.out.println("positivo");
        } else if (n < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("ZERO");
        }

    }    
}
