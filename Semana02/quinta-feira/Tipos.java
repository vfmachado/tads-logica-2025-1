/*
    VARIAVEL - UM (ENDERECO) ESPAÇO ALOCADO  NA MEMORIA CAPAZ DE ARMAZENAR UM numero

    no codigo fonte representamos com um tipo e um nome;
    por exemplo

    int numero;  // variavel chamada numero e do tipo inteiro

    variavel recebe   o que estiver desse lado 
    numero      =      5;
      v (recebendo)       v (avaliada)
    numero            =  numero + 1;

    System.out.println("Numero = " + numero);

    String texto;
*/
import java.util.Scanner;
public class Tipos {
    public static void main(String[] args) {
        // utilidade para transformar entrada de dados em tipos especificos.
        Scanner in = new Scanner(System.in);
        System.out.println("FUNCIONA QUINTOU!");

        //tipos numericos
        int numeros;    // -2.4b até 2.4b
        float reais;    // numeros com vi   rgula (8 casas)
        double precisao;    // muitas casas depois da , 

        // byte, short, long

        // puramente saida textual
        System.out.println("ISSO É UM TEXTO E NADA MAIS");
        System.out.println("digite um numero inteiro: (isso tbm é só um texto)");

        // leitura de dados
        //                V
        numero =   in.nextInt();
        reais =    in.nextFloat();
        precisao = in.nextDouble();        

    } 
} 