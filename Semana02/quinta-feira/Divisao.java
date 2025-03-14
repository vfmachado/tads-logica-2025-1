import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 5;
        int b = 2;

        int c = a / b;  // div de inteiro por inteiro => inteiro
        
        // d esta recebendo um inteiro do resultado da divisao
        float d = a / b;
        
        // aqui forçamos a tipagem em a para float
        // divisao de float com inteiro
        // o maior (espaço) é o float, logo o resultado é float
        float e = (float) a / b;
        //          ^ casting
        // divisao de inteiro por float, resultado tbm é float
        float f = a / 2.0f;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

    }
}