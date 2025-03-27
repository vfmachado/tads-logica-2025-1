import java.util.Scanner;

public class DuracaoPartida {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int horaI, horaF, duracao;
        // TEM MINUTOS TBM =)
        
        // 9h da manha e foi até 12h
        // a duracao de 3h

        // 22h da noite e foir até as 2am
        // a duracao de 4h

        horaI = in.nextInt();
        horaF = in.nextInt();

        if (horaF < horaI) {
            duracao = horaF - horaI;
        } else {
            duracao = 24 - horaI + horaF;   
        }

        System.out.println("DURACAO DA PARTIDA " + duracao);
    }
}
