import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String[] nomes;
        float [] precos;
        int [] quantidades;
        int tamanho;

        System.out.print("Quantos produtos serao informados? ");
        tamanho = in.nextInt();

        nomes = new String[tamanho];
        precos = new float[tamanho];
        quantidades = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("informe nome, o preco e a quantidade  do item #" + i);
            nomes[i] = in.next();
            precos[i] = in.nextFloat();
            quantidades[i] = in.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            float subtotal = precos[i] * quantidades[i];
            
            System.out.println("\nITEM #" + (i+1));
            System.out.println("PRODUTO: " +  nomes[i]);
            System.out.println("R$ " + precos[i]);
            System.out.println("Quant. " + quantidades[i]);
            System.out.println("SubTotal R$ " + subtotal);
        }
        
        // VALOR TOTAL
        float total = 0;
        for (int i = 0; i < quantidades.length; i++) {
            float subtotal = precos[i] * quantidades[i];
            total = total + subtotal;   // total += subtotal
        }
        System.out.println("TOTAL R$ " + total);

        // NOME DO ITEM COM MAIOR QUANTIDADE
        // item com maior quantidade   posMaiorQuantidade;
        int posMaiorQuantidade = 0;
        for (int i = 1; i < quantidades.length; i++) {
            // se as quantidades que tenho na posicao i for maior que as quantidades que tenho na posicao posMaiorQuantidade
            if (quantidades[i] > quantidades[posMaiorQuantidade]) {
                // eu vou atualizar a POSICAO
                posMaiorQuantidade = i;
            }
        }

        System.out.println("MAIOR QUANTIDADE");
        System.out.println(nomes[posMaiorQuantidade]);
        System.out.println(quantidades[posMaiorQuantidade]);
        System.out.println(precos[posMaiorQuantidade]);

        // NOME DO ITEM COM MAIOR SUBTOTAL
        // NOME DO ITEM COM MENOR PRECO
        // NOME DO ITEM COM MENOR SUBTOTAL

    }
}