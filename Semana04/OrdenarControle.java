import java.util.Scanner;

public class OrdenarControle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();


        /*
        a  b  c 
        3  1  2

        a b c
        a c b
        b c a
        b a c
        c a b
        c b a

        3! = 3 * 2 * 1 = 6 possibilidades
        */

        // duas possibilidades em que o a é o menor
        if (a < b && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a < c && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }

        // duas possibilidades em que o B é o menor
        if (b < a && b < c) {
            System.out.println(b);
            if (a < c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        }

        // MAIS DUAS POSSIBILIDADES EM QUE O C É O MENOR
    }
}
