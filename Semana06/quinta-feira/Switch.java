public class Switch {
    public static void main(String[] args) {
        
        // dado um numero que representa um dia da semana, mostrar qual dia é.
        // 1 - domingo
        // 2 - segunda
        // ...

        int dia = 1;    // viria do usuario
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        }
        // ... 7 vezes
    
        /*
            EM TERMOS DE "PODER" O IF É BEM PODEROSO...
            PODEMOS TESTAR QUALQUER EXPRESSAO / VALOR LOGICO
            INCLUSIVE PARA AVALIAR INTERVALOS
            POR EXEMPLO, QUERO SABER SE É DIA DE SEMANA
            if (dia >= 2 && dia <= 6)

            se um numero esta dentro de um intervalo &&
            se um numero esta fora de um intervalo ||   
            por exemplo, x < 10 || x > 20

            qual o possivel problema do if? 
                - legibilidade
                - nao separacao semantica entre as diferentes condicoes

                por exemplo, quando dou opcoes fixas para o usuario
                1. VER SALDO
                2. SACAR
                3. DEPOSITAR
                4. SAIR
        
            POR FALTA DA SEMANTICA NO IF COMO "OPCAO", FAZ MAIS SENTIDO UTILIZAR UMA ESTRUTURA CONDICIONAL CHAMADA SWITCH-CASE

        */
        int valor = 1;
        switch (valor) {
            case 1:
                // o que queremos executar de lógica
                break;      // serve para encerrar o switch case
            case 2: 
                // o que eu quero fazer no case 2
                break;
            case 3: 
                // o que quero fazer no case 3
                break;
            default:    // opcional
                // o que eu quero fazer quando nao satisfaz nenhum dos cases acima
        }
    

    }
}
