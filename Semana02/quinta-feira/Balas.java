import java.util.Scanner;
public class Balas {
    // assinatura do metodo principal em java
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        int balas, criancas, resultado, resto;
        System.out.println("Balas: ");
        balas = in.nextInt();

        System.out.println("Criancas: ");
        criancas = in.nextInt();

        resultado = balas / criancas;
        System.out.println(resultado + " balas por crianca " );

        resto = balas % criancas;
        System.out.println("Sobraram " + resto + " balas");
    }
}