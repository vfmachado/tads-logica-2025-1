import java.util.Scanner;

public class Crescimento {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float popA, taxaA, popB, taxaB;

        while (true) {

            popA = in.nextFloat();
            taxaA = in.nextFloat();
            popB = in.nextFloat();
            taxaB = in.nextFloat();

            if (popA == 0 && popB == 0) break;

            if (taxaB <= taxaA) {
                System.out.println("O segundo pais nao ultrapassara o primeiro");
                continue;
            }

            // caso comum
            int anos = 0;
            while (popB < popA) {
                popA = popA * (1 + taxaA/100);
                popB = popB * (1 + taxaB/100);
                anos++;
                
                System.out.println("ANO " + anos);
                System.out.println("POP A " + popA);
                System.out.println("POP B " + popB);
            }

            System.out.println("Foram necessarios " + anos + " anos para que B ultrapasse A");
        }

    }
}