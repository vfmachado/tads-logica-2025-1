import java.util.Scanner;

public class Soma {
    public static void main(String [] args) {
        // NOMES DE VARIAVEIS MINUSCULAS
        // VARIAVEL => É UM LOCAL PARA ARMAZENAR UM VALOR
        // PRECISO PARA SALVAR O DADO E RECUPERAR ELE (CONSULTAR) QUANDO PRECISAR

        // TODA VARIAVEL TEM TIPO (int) E NOME (x, y, z);
        int a;
        int x, y, z;
        int num1, num2, soma;

        // SCANNER É UMA CLASSE QUE TRANSFORMA O INPUT (TEXTO) NO TIPO DE VARIAVEL CORRETO.
        // PARA USAR O SCANNER, PRECISAR DECLARAR E INDICAR DE ONDE ELE VAI LER OS DADOS.
        Scanner in;
        in = new Scanner(System.in);

        // nextInt => proximo valor inteiro digitado pelo usuario
        System.out.println("Informe 2 numeros inteiros");
        x = in.nextInt();  // ESTAMOS ALTERANDO O VALOR DA VARIAVEL
        y = in.nextInt();
        z = x + y;  // Z ESTÁ SENDO ALTERADO, X E Y ESTAO SENDO AVALIADAS / BUSCADAS
        System.out.println("x + y = " + z); // essa variavel está sendo AVALIADA
        //                            ^  concatenacao / juncao  
    }
}