public class Exemplo01 {

    public static void main(String[] args) {
        
        // VETORES - SAO UMA ESTRUTURA DE DADOS PARA ARMEZENAR MULTIPLOS VALORES DE U MESMO TIPO
        
        // DECLARACAO
        String [] alunos;

        // INICIALIZAÇÃO
        alunos = new String[23];    // 23 indica o tamanho
                                    // e as posicoes vao de 0 a 22

        // O INICIO DO MEU VETOR ACONTECE NA POSICAO 0 DO MEU ENDEREÇO
        alunos[0] = "Andrei";
        alunos[1] = "Victor";
        alunos[2] = "Maicon";
        alunos[3] = "Cristian";
        alunos[4] = "Cristiane";
        alunos[5] = "Grazielli";
        alunos[6] = "Eric";
        alunos[7] = "Vincent";
        // ...
        alunos[22] = "Walber";

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("ALUNO " + i + ": " + alunos[i]);
        }
        

    }

}