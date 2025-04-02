import java.util.Scanner;

public class Intervalo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
}
