/*
Solicite a renda mensal do usuário e aplique uma taxa de juros para um empréstimo baseado na seguinte tabela:

Até R$ 2.000 → taxa de 5% ao mês.
De R$ 2.001 a R$ 5.000 → taxa de 3% ao mês.
Acima de R$ 5.000 → taxa de 1.5% ao mês.
Calcule o valor final do empréstimo após 12 meses com juros compostos.

    M = C (1 + i)^t

 */

import java.util.Scanner;

public class JurosVariavel {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float salario, emprestimo, total = 0, taxa = 0;  

        System.out.println("Informe seu salario e o valor do emprestimo");
        salario = in.nextFloat();
        emprestimo = in.nextFloat();

        System.out.println("TAXA DE JUROS DE ");
        if (salario < 2000) {
            System.out.println("5% ao mes");
            taxa = 1.05f;
        } else if (salario < 5000) {
            System.out.println("3% ao mes");
            taxa = 1.03f;
        } else {
            System.out.println("1.5% ao mes");
            taxa = 1.015f;
        }
        
        total = (float) (emprestimo * Math.pow(taxa, 12));
        System.out.println("VALOR TOTAL PAGO AO LONGO DOS 12 MESES " + total);

        /*
        Math.pow é uma potencia com (base, expoente)
            5ˆ3 = 5 * 5 * 5
            Math.pow(5, 3);
        */
    }   
}
