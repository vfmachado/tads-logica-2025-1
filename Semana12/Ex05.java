import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double r = 1, r1;
        double x = 25;
        
        r1 = 0.5 * (r + x/r);
        System.out.println("r " + r);
        System.out.println("r1 " + r1);
        
        while (true) {
            r = r1;
            r1 = 0.5 * (r + x/r);

            System.out.println("\nr " + r);
            System.out.println("r1 " + r1);

            if (r - r1 < 0.00001) break;
        }

        System.out.println("r1 " + r1);
       
    }
}