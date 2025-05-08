
public class EnaX {
    public static void main(String[] args) {
        
        int numTermos = 10;
        int cont = 1;

        float x = 2;
        float soma = 0;
        float numerador = 1;
        float denominador = 1;  

        // fatorial = multiplicacao de todos os termos da sequencia
        // 4! = 1 x 2 x 3 x 4

        while (cont <= numTermos) {
           
            // System.out.println("numerador: " + numerador);
            numerador = numerador * x;

            // System.out.println("denominador: " + denominador);
            denominador = denominador * cont;

            soma = soma + numerador/denominador;

            cont++;
        }

        System.out.println("E na X = " + soma);

    }
}
