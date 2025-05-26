import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = 11;
        int meio = n / 2 + 1;

        for (int i = 0; i < meio; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= meio -i && j <= meio + i ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = meio - 1; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j > meio -i && j < meio + i ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}