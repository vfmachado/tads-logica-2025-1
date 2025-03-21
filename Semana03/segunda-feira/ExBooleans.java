import java.util.Scanner;

public class ExBooleans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // NOMES DE VARIAVEIS DO TIPO BOOLEAN, DEVEM SER AFIRMATIVOS
        boolean estaVazio;  // naoCheio, naoVazio
        boolean vivo;       // naoVivo
        boolean maiorIdade; // nao deveria ser naoMaiorIdade
        boolean menorIdade;

        boolean p, q, r;
        p = true;
        q = false;
        // &&  OPERADOR RELACIONAL 'E'
        // TRUE QUANDO AMBOS SAO TRUE
        r = p && q;
        System.out.println(" p && q " + r);
        
        // ||  OPERADOR RELACIONAL 'OU'
        // TRUE QUANDO PELO MENOS UM DELES É TRUE
        r = p || q;
        System.out.println(" p || q " + r);

        // !  OPERADOR NOT (NAO)
        // ALTERA O VALOR, OU SEJA, SE TRUE -> FALSE, SE FALSE -> TRUE
        boolean naoP = !p;
    }
}