// DADO A NOTA DO ALUNO, CLASSIFICAR ENTRE A, B, C, D
import java.util.Scanner;
public class Classificacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        float nota = in.nextFloat();
        // LEMBRA QUE É UMA PERGUNTA ... RETORNA UMA RESPOSTA... TRUE/FALSE
        // quando meu bloco é composto por um unico statement (linha ou outro bloco), as chaves sao opcionais
        if (nota == 10) {
            System.out.println("A");
        } else if (nota >= 9) {
            System.out.println("B");
        } else if (nota >= 7 ) {
            System.out.println("C");
        } else  {   // ELSE (APENAS ELSE E SOMENTE ELSE) É OPCIONAL
            System.out.println("D");
        }
        
    }
}