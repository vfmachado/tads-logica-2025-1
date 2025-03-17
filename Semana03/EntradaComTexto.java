import java.util.Scanner;

public class EntradaComTexto {
    public static void main(String[] args) {
        Scanner in = new Scanner("2 vini 9,5");
        // TIPO DE DADO NAO PRIMITIVO!
        int a = in.nextInt();
        String b = in.next();
        float c = in.nextFloat();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
