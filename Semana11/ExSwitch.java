import java.util.Scanner;

public class ExSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        
        // escolha 
        switch (opcao) {
            case 1: 
                System.out.println("o valor digitado foi 1");
                break;
            case 2:
                System.out.println("digitou 2");
                break;
            case 3:
                System.out.println("digitou 3");
                break;
            default:    // else
                System.out.println("Caso padrao... nao entrou em qlqr outro caso, vai cair aqui ...");
        }
    }
}