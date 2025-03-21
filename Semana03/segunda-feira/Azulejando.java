// faca um programa que dado as dimensoes de uma cozinha retangular (altura das paredas, comprimento das paredes) indique quantos m2 de piso sao necessarios para azulejar as 4 paredes e o piso. Depois pergunte ao usuarios quantos m2 vem em cada caixa e valor da caixa e indique quantas caixas de piso devem ser compradas e o valor total de piso
import java.util.Scanner;

public class Azulejando {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float largura, altura, comprimento, areaParedeA, areaParedeB, areaPiso, areaTotal;

        System.out.println("Informe a altura, comprimento e largura");
        altura = in.nextFloat();
        comprimento = in.nextFloat();
        largura = in.nextFloat();

        areaParedeA = altura * largura;
        areaParedeB = altura * comprimento;
        areaPiso = comprimento * largura;

        areaTotal = 2 * areaParedeA + 2 * areaParedeB + areaPiso;

        System.out.println("Parede A  = " + areaParedeA);
        System.out.println("Parede B  = " + areaParedeB);
        System.out.println("Piso = " + areaPiso);
        System.out.println("\nTotal = " + areaTotal);

        float m2Caixa;
        int totalCaixas;

        System.out.println("Quantos m2 vem em cada caixa?");
        m2Caixa = in.nextFloat();
        // pega o resultado e transforma em inteiro
        //              v   casting
        totalCaixas = (int) (areaTotal / m2Caixa);
        
        int cxAdicional = (int) ( ( areaTotal % m2Caixa ) / m2Caixa + 0.99f);

        totalCaixas = totalCaixas + cxAdicional;
        System.out.println("Total de caixas " + totalCaixas);
        
        System.out.println("Valor por caixa");
        float valorCx = in.nextFloat();
        float valorTotal = totalCaixas * valorCx;

        System.out.printf("\n=== R$ %.2f ===\n", valorTotal);

    }
}