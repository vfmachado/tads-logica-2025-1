
# 04

# Estruturas Condicionais em Java

## Introdução
Nesta aula, vamos aprender sobre controle de fluxo em Java, especificamente as estruturas condicionais. Essas estruturas nos permitem controlar o fluxo de execução do programa com base em condições específicas.

## 1. Estrutura Condicional `if`
A estrutura `if` permite executar um bloco de código se uma condição for verdadeira.

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

## 2. Estrutura Condicional `if-else`
A estrutura `if-else` permite executar um bloco de código se uma condição for verdadeira e outro bloco de código se a condição for falsa.

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

## 3. Estrutura Condicional `if-else if-else`
A estrutura `if-else if-else` permite verificar múltiplas condições encadeadas.

```java
int nota = 75;

if (nota >= 90) {
    System.out.println("Aprovado com A.");
} else if (nota >= 80) {
    System.out.println("Aprovado com B.");
} else if (nota >= 70) {
    System.out.println("Aprovado com C.");
} else {
    System.out.println("Reprovado.");
}
```

## 4. Operadores Lógicos
- `&&` (E lógico): Retorna verdadeiro se ambas as condições forem verdadeiras.
- `||` (OU lógico): Retorna verdadeiro se pelo menos uma das condições for verdadeira.
- `!` (Negação lógica): Inverte o valor de uma condição.

```java
int idade = 25;
boolean ehEstudante = false;

if (idade >= 18 && !ehEstudante) {
    System.out.println("Você é maior de idade e não é estudante.");
}
```

## Conclusão
As estruturas condicionais em Java são ferramentas poderosas para controlar o fluxo de execução do programa com base em diferentes condições. Com o uso de `if`, `if-else`, `if-else if-else` e operadores lógicos, podemos criar programas que tomam decisões dinâmicas e respondem a várias situações. Pratique esses conceitos para se tornar mais fluente no uso de estruturas condicionais em Java.