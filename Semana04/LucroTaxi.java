import java.util.Scanner;

public class LucroTaxi {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // preco é 4.599    // vamos arrendondar para 5 para ficar facil de testar
        float kmInicial, kmFinal, valorPago, quantLitros, lucro, mediaConsumo;

        System.out.println("Informe kmInicial, kmFinal, valorPago, qauntLitros");
        kmInicial = in.nextFloat();
        kmFinal = in.nextFloat();
        valorPago = in.nextFloat();
        quantLitros = in.nextFloat();

        mediaConsumo = (kmFinal - kmInicial)/quantLitros;

        float custoOperacional = quantLitros * 5;
        lucro = valorPago - custoOperacional;

        System.out.println("MEDIA DE CONSUMO " + mediaConsumo);
        System.out.println("LUCRO " + lucro);
    }
}
