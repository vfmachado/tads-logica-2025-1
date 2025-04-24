import java.util.Scanner;

public class ExemploConta {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int opcao, saldo = 1000;
        boolean executando = true;

        while (executando) {

            System.out.println("informe a opcao desejada" +
            "\n1. VER SALDO" + 
            "\n2. SACAR" + 
            "\n3. DEPOSITAR" + 
            "\n4. SAIR"
            );

            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("SALDO " + saldo);
                    break;
                case 2: 
                    System.out.println("quanto deseja sacar?");
                    int saque = in.nextInt();
                    if (saldo >= saque) {
                        saldo = saldo - saque;
                    } else {
                        System.out.println("Saldo indisponivel");
                    }
                    break;
                case 3: 
                    System.out.println("quanto deseja depositar?");
                    int deposito = in.nextInt();
                    saldo += deposito;  // saldo = saldo + deposito;
                    break;
                case 4: 
                    System.out.println("BYE");
                    executando = false;
                    break;
                default:
                    System.out.println("ESSA OPCAO É INVALIDA");
                    break;
            }

            // aqui fora um break quebra o laço?
        }

    }
}
