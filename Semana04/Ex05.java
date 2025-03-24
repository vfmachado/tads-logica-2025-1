import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int x, y, resultado = 0;
        String operador;    // qualquer texto
        char op;            // é uma letra

        x = in.nextInt();
        operador = in.next();
        y = in.nextInt();
        // op = in.next().charAt(0);

        if (operador.equals("+")) {
        // if (op == '+') {
            resultado = x + y;
        }

        if (operador.equals("-")) {
        // if (op == '-') {
            resultado = x - y;
        }

        if (operador.equals("*")) {
        // if (op == '*') {
            resultado = x * y;
        }

        if (operador.equals("/")) {
        // if (op == '/') {
            resultado = x / y;
        }

        System.out.printf("%d %s %d = %d\n", x, operador, y, resultado);
    }    
}
