import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int [] v = new int[10000];
        for (int i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(100000);
        }

        System.out.println(v.length);

        int trocas = 0;
        long tempoInicial = System.nanoTime();

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                // System.out.println("comparando " + v[i] + " com " + v[j]);
                
                if (v[j] < v[i]) {
                    // TROCAR O VALOR DE v[i] com v[j]
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;

                    trocas++;
                }
            }
        }

        long tempoFinal = System.nanoTime();

        // for (int i = 0; i < v.length; i++) {
        //     System.out.print(v[i] + "  ");
        // }
        // System.out.println();

        System.out.println("Trocas: " + trocas);
        long duracao = (tempoFinal - tempoInicial)/1000000;
        System.out.println("TEMPO EM MILLI SEGUNDOS " + duracao);
    }
}