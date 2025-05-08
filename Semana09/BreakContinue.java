public class BreakContinue {
    public static void main(String[] args) {
        
        // continue
        for (int i = 0; i < 10; i++) {
            System.out.println();
            // bloco 1
            System.out.println("BLOCO 1 PARA i = " + i);

            // imagine que em determinado cenario, eu nao quero executar o bloco 2 MAS quero que o laço siga executando .. vamos supor que quando i == 5
            if (i == 5) continue;   // ignora o resto do bloco para ESTA execucao do laço

            // bloco 2
            System.out.println("BLOCO 2 PARA i = " + i);


            // o BREAK PARA O LAÇO (A REPETICAO INTEIRA)
            if (i == 7) break;
        }

    }
}
