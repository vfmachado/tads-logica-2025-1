

# 03

Variáveis, tipos de dados, scanner, strings, operadores aritméticos, operadores relacionais


# Aula Detalhada sobre Conceitos Básicos em Java

## Introdução
Nesta aula, vamos explorar conceitos fundamentais em Java, incluindo variáveis, tipos de dados, entrada do usuário com o Scanner, manipulação de strings, operadores aritméticos e operadores relacionais.

## 1. Variáveis e Tipos de Dados
- Em Java, as variáveis são espaços de memória que armazenam dados.
- Cada variável possui um tipo de dado que define o tipo de valores que podem ser armazenados.
- Tipos de dados primitivos em Java:
    - **int:** números inteiros.
    - **double:** números decimais de ponto flutuante.
    - **boolean:** valores true ou false.
    - **char:** caracteres individuais.
- Exemplo de declaração de variável e atribuição de valor:

```java
int idade = 25;
double altura = 1.75;
boolean ehEstudante = true;
char genero = 'M';
```

## 2. Scanner
- O Scanner é uma classe em Java que permite ler dados de entrada do usuário.
- Para usar o Scanner, precisamos importar a classe `Scanner` do pacote `java.util`.
- Exemplo de uso do Scanner para ler um número inteiro:

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

System.out.println("Sua idade é: " + idade);

scanner.close();
```

## 3. Strings
- Strings representam sequências de caracteres em Java.
- Podem ser declaradas utilizando-se a classe String.
- Exemplo de manipulação de strings:

```java
String nome = "Maria";
String sobrenome = "Silva";
String nomeCompleto = nome + " " + sobrenome;

System.out.println("Nome completo: " + nomeCompleto);
```

## 4. Operadores Aritméticos
- Java oferece diversos operadores aritméticos para realizar operações matemáticas.
- Exemplos de operadores aritméticos: `+`, `-`, `*`, `/`, `%` (resto da divisão).
- Exemplo de uso de operadores aritméticos:

```java
int a = 10;
int b = 5;

int soma = a + b;
int subtracao = a - b;
int multiplicacao = a * b;
double divisao = (double) a / b;
int resto = a % b;
```

## 5. Operadores Relacionais
- Operadores relacionais são utilizados para comparar valores.
- Exemplos de operadores relacionais: `==` (igual), `!=` (diferente), `<` (menor que), `>` (maior que), `<=` (menor ou igual), `>=` (maior ou igual).
- O resultado de uma operação relacional é um valor booleano (true ou false).
- Exemplo de uso de operadores relacionais:

```java
int x = 10;
int y = 5;

boolean igual = (x == y);
boolean diferente = (x != y);
boolean maiorQue = (x > y);
boolean menorOuIgual = (x <= y);
```


## 6. Tipos primitivos em Java

Abaixo são listados os tipos primitivos disponíveis em Java, cada um adequado para diferentes tipos de dados e intervalos de valores. Escolha o tipo apropriado com base nos requisitos específicos do seu programa.

### 1. Tipo `byte`
- Armazena números inteiros de 8 bits.
- Faixa de valores: -128 a 127.
- Exemplo de uso:

```java
byte idade = 25;
```

### 2. Tipo `short`
- Armazena números inteiros de 16 bits.
- Faixa de valores: -32,768 a 32,767.
- Exemplo de uso:

```java
short distancia = 1000;
```

### 3. Tipo `int`
- Armazena números inteiros de 32 bits.
- Faixa de valores: -2^31 a 2^31 - 1.
- Exemplo de uso:

```java
int populacao = 1000000;
```

### 4. Tipo `long`
- Armazena números inteiros de 64 bits.
- Faixa de valores: -2^63 a 2^63 - 1.
- Exemplo de uso:

```java
long valorGrande = 10000000000L;
```

### 5. Tipo `float`
- Armazena números decimais de precisão simples de 32 bits.
- Faixa de valores: aproximadamente ±1.4 × 10^-45 a ±3.4 × 10^38.
- Exemplo de uso:

```java
float preco = 19.99f;
```

### 6. Tipo `double`
- Armazena números decimais de precisão dupla de 64 bits.
- Faixa de valores: aproximadamente ±4.9 × 10^-324 a ±1.8 × 10^308.
- Exemplo de uso:

```java
double altura = 1.75;
```

### 7. Tipo `boolean`
- Armazena valores lógicos verdadeiro ou falso.
- Não possui valor mínimo ou máximo.
- Exemplo de uso:

```java
boolean ehEstudante = true;
```

### 8. Tipo `char`
- Armazena caracteres Unicode de 16 bits.
- Faixa de valores: '\u0000' a '\uffff'.
- Exemplo de uso:

```java
char letra = 'A';
```
