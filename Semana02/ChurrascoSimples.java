import java.util.Scanner;
public class ChurrascoSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int adultos, criancas;
        float total;
        // adultos comem em media 400 gramas
        // criancas comem em media 150 gramas
        // CALCULE EM KILOS QUANTO DE CARNE PRECISO PARA DETERMINADO NUMERO DE ADULTOS E CRIANCAS
        System.out.println("Informe a quantidade de adultos e criancas");
        adultos = in.nextInt();
        criancas = in.nextInt();
        total = adultos * 400 + criancas * 150;
        total = total / 1000;
        System.out.println("Total em kilos " + total);
    }
}

