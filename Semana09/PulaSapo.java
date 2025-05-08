import java.util.Scanner;

public class PulaSapo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int pulo;
        int nCanos;

        int alturaCano;
        int ultimo = 0;
        boolean venceu = true;

        System.out.println("informe a altura do pulo e quantidade de canos");
        pulo = in.nextInt();
        nCanos = in.nextInt();

        for (int i = 0; i < nCanos; i++) {
            System.out.println("Informe a altura do cano " + i);
            alturaCano = in.nextInt();

            if (i == 0) {
                ultimo = alturaCano;
                continue;
            }

            int diferenca = alturaCano - ultimo;
            if (diferenca < 0) {
                diferenca = diferenca * -1;
            }
            System.out.println(diferenca);

            if (diferenca > pulo) {
                System.out.println("JA ERA ... nao tem como pq ja perdeu");
                venceu = false;
            }

            ultimo = alturaCano;
        }

        System.out.println("A FASE PODE SER CONCLUIDA " + venceu);
    }
}
