
# 02

Estrutura de algoritmos & Comandos básicos


# Introdução à Programação

Nesta aula introdutória, exploraremos os fundamentos de diferentes paradigmas de programação, abrangendo:

## 1. Programação Estruturada
- Organização lógica do código em sequências de instruções.
- Ênfase na clareza e modularidade.
- Exemplos: C, Pascal.

## 2. Programação Orientada a Objetos (POO)
- Baseada em entidades chamadas objetos, que possuem características (atributos) e comportamentos (métodos).
- Pilares:
    - **Abstração:** Foco nos aspectos essenciais de um objeto.
    - **Encapsulamento:** Ocultação de detalhes de implementação, permitindo o acesso controlado aos atributos e métodos.
    - **Herança:** Possibilidade de criar novas classes a partir de classes existentes, aproveitando características e comportamentos já definidos.
    - **Polimorfismo:** Capacidade de objetos de diferentes classes responderem de maneira única a uma mesma mensagem.
- Exemplos: Java, Python.

## 3. Programação Orientada a Eventos
- Baseada em eventos disparados por ações do usuário ou do sistema.
- Funciona com um loop de eventos que aguarda e responde a eventos específicos.
- Amplamente utilizada em interfaces gráficas e aplicações interativas.
- Exemplos: JavaScript, GUI frameworks como Qt.

## 4. Programação Funcional
- Baseada no conceito de funções puras e imutabilidade.
- Ênfase em expressões e avaliação de funções.
- Utiliza técnicas como recursão e funções de alta ordem.
- Exemplos: Haskell, Scala, JavaScript (em parte).

Estes paradigmas representam diferentes abordagens para resolver problemas de programação, cada um com suas vantagens e casos de uso específicos. Ao longo do curso, exploraremos mais a fundo cada um deles.


# Aula Introdutória de JAVA

## Introdução
Explorarando os conceitos básicos da linguagem de programação Java. Como criar, compilar e executar um programa simples em Java, além de demonstrar como mostrar mensagens na tela, calcular valores e receber entradas do usuário.

## Estrutura Básica
Um programa Java é composto por uma ou mais classes. Cada classe é definida em um arquivo com o mesmo nome da classe e a extensão `.java`. Cada arquivo pode conter uma única classe pública. A estrutura básica de uma classe Java é a seguinte:

```java
public class NomeDaClasse {
    // Corpo da classe
    public static void main(String[] args) {
        // Método principal (ponto de entrada do programa)
    }
}
```

## Compilando
Para compilar um programa Java, utilizamos o comando `javac` seguido do nome do arquivo que contém a classe principal. Por exemplo, se nosso arquivo se chama `MeuPrograma.java`, o comando seria:

```
javac MeuPrograma.java
```

## Executando
Após compilar o programa, podemos executá-lo utilizando o comando `java` seguido do nome da classe principal (sem a extensão `.class`). Por exemplo:

```
java MeuPrograma
```

## Mostrando uma Mensagem
Para exibir uma mensagem na tela, utilizamos o método `System.out.println()`. Por exemplo:

```java
public class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

## Calculando um Valor
Para realizar cálculos em Java, podemos utilizar operadores aritméticos como `+`, `-`, `*` e `/`. Por exemplo:

```java
public class Calculadora {
    public static void main(String[] args) {
        int resultado = 10 + 5;
        System.out.println("O resultado é: " + resultado);
    }
}
```

## Recebendo um Valor do Usuário
Para receber entradas do usuário, podemos utilizar a classe `Scanner` do pacote `java.util`. Por exemplo:

```java
import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Você digitou: " + numero);

        scanner.close();
    }
}
```

## Conclusão
Nesta aula, aprendemos os conceitos básicos da linguagem de programação Java, incluindo sua estrutura básica, como compilar e executar um programa, como exibir mensagens na tela, realizar cálculos e receber entradas do usuário. Esses são os primeiros passos para começar a desenvolver aplicativos em Java.