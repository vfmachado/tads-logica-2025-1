
// NOME DA CLASSE EXATAMENTE IGUAL AO NOME DO ARQUIVO (SEM A EXTENSAO .java)

import java.util.Scanner;

public class Controle {
    
    // MAIN - PRINCIPAL
    public static void main(String[] args) {
        
        /*
        TODOS ALGORITMOS QUE FIZERMOS PODEM SEGUIR A SEGUINTE ESTRUTURA

            VARIAVEIS
            ENTRADA DE DADOS
            PROCESSAMENTO   (AQUI É ONDE MAIS TEM LOGICA)
            SAIDA
        */

        int idade, ano, diaDomes;
        float preco, salario, alturaEmMetros;
        double aproximacaoMatematica, valoresPercentuais; // com muitas casas

        String textos;  // qualquer texto... de qlqr tamanho
        char letra;    // char guarda uma letra

        // SERVE PARA ENTRADA DE DADOS, SYSTEM.IN -> ENTRADA PADRADO DO TERMINAL, TECLADO
        Scanner in;
        in = new Scanner(System.in);    

        // Scanner in2 = new Scanner(System.in);    


        // condicionais
        /*
        ESTRUTURAS CONDICIONAIS SERVEM PARA DEFINIRMOS O FLUXO DO NOSSO CÓDIGO..

        AO INVES DE EXECUTARMOS LINHA A LINHA ... PODEMOS AVALIAR ATRAVÉS DE OPERAÇÕES LÓGICAS SE QUEREMOS OU NAO EXECUTAR DETERMINADO TRECHO DE CODIGO

        SE (VALOR_LOGICO) {
            BLOCO DE CODIGO
        }

        if (variavel/expressao) {
            // bloco só é executado caso o valor lógico acima seja verdadeiro
        }

        expressoes lógicas
        >       >=       <      <=      !=      ==      &&      ||       !
                                        dif             e       ou      nao


        QUANDO EU TENHO UM OUTRO TESTE QUE É EXATAMENTE O OPOSTO DO PRIMEIRO
        int v = in.nextInt();

        boolean ehPar = v % 2 == 0;
        
        if (ehPar) {
            ... msg indicando que é par
        } else {    // SENAO
            ... msg indicando que é imar 
        }
                             
         */

    }
}
