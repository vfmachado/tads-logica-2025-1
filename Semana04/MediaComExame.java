import java.util.Scanner;

public class MediaComExame {
    public static void main(String[] args) {
        
        /*
        media de 3 notas
        >= 7    aprovado
        < 3     reprovado
        >= 3 && < 7  exame
            em caso de exame
                ( ex + media ) / 2 >= 5
                    para ser aprovado

         */

        Scanner in = new Scanner(System.in);
        float n1, n2, n3, media;
        
        System.out.println("informe as notas");

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();

        media = n1 + n2 + n3;      //  (n1 + n2 + n3)/3
        media = media/3;    // media /= 3;

        System.out.println("MEDIA " + media);

        if (media >= 7) {
            System.out.println("APROVADO COM MEDIA");
        } else if (media < 3) {
            System.out.println("REPROVADO ... nao tem media suficiente para exame");
        } else {
            System.out.println("EXAME");
            System.out.println("informe a nota do exame");

            // declarei uma nova variavel no meio do codigo
            // ESCOPO DE VARIAVEL - ela só existe dentro deste bloco (e blocos dentro deste se houverem)
            float exame = in.nextFloat();
            media = (media + exame) / 2.0f;     // 2

            if (media >= 5) {
                System.out.print("Aprovacao apos exame ");
            } else {
                System.out.print("Reprovacao ");
            }

            System.out.println("com media " + media);
        }

    }   
}
