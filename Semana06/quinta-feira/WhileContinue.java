import java.util.Scanner;

public class WhileContinue {
    public static void main(String[] args) {
        
        // O USUARIO DEVE INFORMAR 5 NOTAS VALIDAS
        // UMA NOVA VALIDA É >= 0 E <= 10
        // NO FINAL, CALCULAR A MEDIA DAS NOTAS VALIDAS

        Scanner in = new Scanner(System.in);
        float soma = 0, quantidade = 0;

        while (quantidade < 5) {
            System.out.println("informe a nota " + (quantidade+1));
            float nota = in.nextFloat();
            if (nota < 0 || nota > 10) continue;    // eu volto na condicao do laço
            // ignorando o que está abaixo
            // nao sendo mais necessario colocar o codigo dentro de uma condicional
            
            soma = soma + nota;
            quantidade++;
            
        }

        float media = soma/5;
        System.out.println("MEDIA " + media);

    }
}
