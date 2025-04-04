// 5. CALCULAR A MEDIA DE 10 VALORES

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int contador = 0;
        float valor, soma = 0, media;

        while (contador < 10) {
            valor = in.nextFloat();
            soma = soma + valor;        // soma += valor;
            
            System.out.println("CONTADOR  " + contador);
            System.out.println("SOMA  " + soma);
            contador++;   // contador = contador + 1
        }
        
        media = soma / 10;
        System.out.println(media);
    }
}
