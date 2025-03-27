import java.util.Scanner;

public class VencedorL03Ex06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String time1, time2;
        int gols1, gols2;

        String resultado;

        System.out.println("Indique o nome do time e a quantidade de gols (2x)");
        time1 = in.next();  // String = texto
        gols1 = in.nextInt();   // inteiro

        time2 = in.next();
        gols2 = in.nextInt();


        // IDENTIFICAR QUEM GANHOU
        if (gols1 >  gols2) {
            resultado = time1;
        } else if (gols1 == gols2) {        // NADA MAIS É DO QUE UM IF DENTRO DE UM ELSE
            resultado = "EMPATE";
        } else {
            resultado = time2;
        }

        // criando a variavel resultado a gente separou o processamento da saída
        System.out.println(resultado);

        // resultado = "" +  0; // concatenando a String na frente, força para que seja String
    }
}
