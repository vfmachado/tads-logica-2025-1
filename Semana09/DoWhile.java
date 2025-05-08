import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        String senha = "1234";
        Scanner in = new Scanner(System.in);

        String digitado;
        
        // forçamos a repeticao antes do teste
        do {
            System.out.println("informe a senha");
            digitado = in.next();
        } while (!digitado.equals(senha));

    }
}
