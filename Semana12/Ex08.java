import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n -1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println("   ");
        }

    }
}