# :monocle_face: Diretório de estudos java

> Esse repositório tem como objetivo, propor materiais de estudo, projetos e testes de códigos.

> Aproveite para garfar o diretório, praticar e codar 😎!

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Bassetin)


# :books: O que iremos estudar? 

## :brain: Anatomia da Classe

> A escrita de um código de programa é feita através da composição de palavras pré-definidas pela linguagem **(palavras reservadas)**, com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos.

> É muito comum utilizarmos expressões no **inglês**, existem projetos que a composição dos mesmos exigem que sejam feitos totalmente em inglês.

> 99,9% das nossas classes iniciarão com `public class`.

> Toda classe deve ter um nome e arquivo com o mesmo nome.

> Após o nome, definir o corpo `{ }`, onde irá compor nossas classes com atributos e métodos.

### Método principal - main

> É o método principal da nossa aplicação, será utilizado no bloco de código da classe executável. Ou seja, colocamos o método `main` na classe onde executaremos o nosso projeto.

> Dentro de uma aplicação, só utilizaremos *somente* **UM** método `main`.

> O método `main` sempre terá a visibilidade `public` (para ser visivel e executavel em toda aplicação), será definido como `static` (para poder trabalhar de forma distinta das outras classes e métodos), não retornará nenhum valor com `void` (palavra reservada para dizer que o bloco não precisará retornar algum valor) e receberá um parâmetro do tipo Array de caracteres `String []`(Para emitirmos textos, frases e argumentos para a classe). 

### Tipos de Dados primitivos

| Tipos | Valores | Memória |
| :---         |     :---:      |          ---: |
| `byte`   | -128 / 128     | 1 byte    |
| `short`     | -32.768 / 32.767      | 2 bytes     |
| `int`   | 2.147.483.647 (neg/pos)| 4 bytes      |
| `long`    | 9.223.372.036.854.775.807 (neg/pos)  | 8 bytes      |
| `float`   | 3,4028E + 38  (neg/pos) | 4 bytes    |
| `double`   | 1,7976E + 308 (neg/pos)  | 8 bytes   |
| `char`   | 'h', 'm','x'   | 1 byte    |
| `String`    | "lucas","naruto"   | 1 byte/ cada    |
| `boolean`    | false, true   | 1 bit    |

> [!WARNING]
> É preciso saber qual tipo de dados utilizaremos e depois escolher o mesmo.

> Desses tipos de dados, os tipos númericos inteiros são : `Byte`, `short` , `int` e `long`.

> Desses tipos de dados, os tipos númericos fracionários são : `float` e `double`.

> Dos dados que sobraram, os tipos de texto temos : `char` e `String`.

> E um tipo de dado lógico : `boolean`.


## :chart_with_upwards_trend: Variáveis
 
> Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Toda variável é composta por: tipo de dados + nomeDaVariável + valor atribuído. (O último em salvos casos podendo estar em branco).

> Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

> No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.
```
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```
> [!IMPORTANT]
> Os tipos de dados é a parte mais importante da declaração das variáveis, pois é o que vai definir o tipo de dado que estaremos manipulando na variável. Importante saber com qual tipo de dados trabalharemos!

Observe essas peculiaridades do código abaixo :

```
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
```
> [!WARNING]
> Observe que o tipo long precisa terminar com **L**, o tipo float precisa terminar com **F** e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.

O java é fortemente tipado! Logo, temos que ter cuidado ao declarar as variáveis. Observe:
```
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```
> Nesse código, conseguimos declarar a variável numeroCurto e numeroNormal, porém a numeroCurto2 não conseguiremos, pois o  `short` ser menor que o `int`. Porém o contrário, conseguiremos.

## :pushpin: Constantes

> Constantes seguem os mesmos padrões que uma variável, porém com uma diferença.

> Constantes, são valores armazenados em memória que **NÃO** podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada `final`, seguida do tipo.

Abaixo teremos alguns exemplos de **Variáveis** e **Constantes** :

```
public class ExemploVariavel {
	public static void main(String[] args) {
		/*
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
		int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
	}
}
```

## :shipit: Operadores

> Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

**Classificação dos operadores** 
| Operador | Tipo | Comparação |
| :---         |     :---:      |          ---: |
| `==`   | **Relacional**  | igual a    |
| `!=`     | **Relacional**    | diferente de     |
| `<=`   | **Relacional**   | menor ou igual a     |
| `>=`    | **Relacional**   | maior ou igual a   |
| `>`   | **Relacional** | maior que  |
| `<`   | **Relacional**  | menor que  |
| `=`   | **Atribuição**  | recebe ... |
| `?:`    | **Ternário**   | condicional   |
| `+,*,/,-,%,^`    |  **Aritmético**  | cálculos  |
| `++, --`    | **Unário**   | (de)incremento   |
| `&& ou \\`    |  **Lógico**  | e ; ou  |

### Atribuição

> Representado pelo símbolo de igualdade `=`.

> O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.

Igual esses exemplos abaixo:

```
//classe Operadores.java
String nome = "GLEYSON";
int idade = 22;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
Date dataNascimento = new Date();
```

### Aritméticos

> O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

> Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação), `/` (divisão), `%` (módulo) e `^` (potência).

```
//classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);
```
> [!IMPORTANT]
> ATENÇÃO! O operador de adição (`+`), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos” (juntar textos).

```
//classe Operadores.java
String nomeCompleto = "LINGUAGEM" + "JAVA";
```

### Unários
<details>
  
<summary> Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos. </summary>

> (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

> (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

> (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

> (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

> (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
</details>

> Os operadores de incremento e decremento, podem ser utilizados antes das variáveis e depois. Porém, isso altera a leitura do programa.

> Enquanto o préfixo, incrementa sem antes chegar na variável. O sufixo, incrementa apenas depois.

Alguns exemplos: 

```
//classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
```
> [!CAUTION]
> Muito cuidado com ordem de precedência, dos operadores unários!.


### Ternário

> O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

>O operador ternário é representado pelos símbolos `"?" e ":"` utilizados na seguinte estrutura de sintaxe:

`<Expressão Condicional> ? <Caso seja verdadeira> : <Caso seja falsa>;`

Veremos agora, alguns exemplos :

```
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);
```

> [!NOTE]
> O operador ternário é aplicado para qualquer tipo de valor.

### Relacionais

<details>
<summary> Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.
</summary>

> (==) Quando desejamos verificar se uma variável é IGUAL A outra.

> (!=) Quando desejamos verificar se uma variável é DIFERENTE da outra.

> (>) Quando desejamos verificar se uma variável é MAIOR QUE a outra.

> (>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

> (<) Quando desejamos verificar se uma variável é MENOR QUE outra.

> (<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

</details>

Alguns exemplos :

```
//classe Operadores.java
int numero1 = 1;
int numero2 = 2;

if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");
```

### Lógicos 

> Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

> `&&` Operador Lógico "E".

> `||` Operador Lógico "OU".

Alguns exemplos :
```
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
```
> [!NOTE]
> Podemos também, fazer expressões mais complexas combinando os dois.

> A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer dizer que, se a condição1 atender aos critérios, não será necessário validar a condição2.

```
// ComparacaoAvancada.java
int numero1 = 1;
int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
```
> O mesmo acontece com o operador | e || , considerando que operador, agora representa que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.

## Métodos


Essa documentação teve base em vários materiais de estudos.
> [Gitbook Java Básico](https://glysns.gitbook.io/java-basico)

