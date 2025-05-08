// FAZER UM PROGRAMA QUE INVERTA UM NUMERO
// 12345 > 54321
// UTILIZANDO OPERACOES MATEMATICAS
public class Inversor {
    public static void main(String[] args) {
        
        int n = 123456; // vamos executar 6x
        // n = 123  seriam 3 vezes
        // n = 12345678 seriam 8 vezes
        int resposta = 0;
        
        int ultimoDigito;
        // n = 45
        while (n > 0) {  // 45 passa no teste
            ultimoDigito = n % 10;  // ultD = 5     (resto de 45 % 10)
            System.out.println(ultimoDigito);
            n = n / 10; // atualizamos n com a divisao por 10
                        // 45/10 = 4

            resposta = resposta * 10 + ultimoDigito;    
            // 6 * 10 + ultD  (5) = 654
            System.out.println(resposta);
        }
       
    }
}
