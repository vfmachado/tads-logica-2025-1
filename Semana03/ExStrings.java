import java.util.Scanner;

public class ExStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TIPO DE DADO NAO PRIMITIVO!
        // S MAIUSCULO
        String texto;
        String nome;
        String html;
        String cpf;
        String codigoBarras;

        // PARA LER UMA PALAVRA EM JAVA
        // in.next();

        // para ler mais do que uma palavra junto, lemos uma linha em java.
        // in.nextLine();   // NAO RECOMENDO EM LOGICA!
        // o nextLine gera um buffer no scanner com o newline (\n) sendo uma entrada

        // COMPARACAO DE STRING É UTILIZANDO O EQUALS
        // POR NAO SER UM TIPO PRIMITIVO, A COMPARACAO PADRÃO (==) É FEITA POR REFERENCIA (PONTEIRO) ... COMO QUEREMOS O CONTEÚDO DO TEXTO, UTILIZAMOS O EQUALS, O RESULTADO SERÁ TRUE/FALSE

        String nicknameA = "vini";
        String nicknameB = "vini";
        String nicknameC = "ViNi";
        System.out.println(nicknameA.equals(nicknameB));
        System.out.println(nicknameA.equals(nicknameC));
    }
}