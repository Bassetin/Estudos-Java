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

>Os modificadores `public` e `static` podem ser escritos em qualquer ordem ( `public static ` ou `static public`), mas a convenção é usar `public static`.

> O `main` método aceita um único argumento: um array de elementos do tipo `String`. Essa matriz é o mecanismo pelo qual o sistema de tempo de execução passa informações para sua aplicação.Cada string na matriz é chamada de argumento de linha de comando . Os argumentos da linha de comando permitem que os usuários afetem a operação do aplicativo sem recompilá-lo. 


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

## Matrizes

Uma matriz é um objeto contêiner que contém um número fixo de valores de um único tipo. O comprimento de uma matriz é estabelecido quando a matriz é criada. Após a criação, seu comprimento é fixo.

<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif">
 	<source media="(prefers-color-screme: light)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif">
 	<img alt="Exemplo de um Array." src="https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif">
 
</picture>

> Cada item em uma matriz é chamado de elemento e cada elemento é acessado por seu índice numérico. Conforme mostrado na ilustração anterior, a numeração começa em 0. O 9º elemento, por exemplo, seria portanto acessado no índice 8.

**Como declaramos uma array?**

Assim como as declarações para variáveis ​​de outros tipos, uma declaração de array possui dois componentes: o tipo do array e o nome do array. O tipo de um array é escrito como `type[]`, onde type é o tipo de dados dos elementos contidos; os colchetes são símbolos especiais que indicam que esta variável contém um array. O tamanho do array não faz parte do seu tipo (é por isso que os colchetes estão vazios). 

```
//declara um array de inteiros
int[] umaArray;
```

**Inicializando o array**

Uma maneira de criar um array é com o operador `new`. A próxima instrução do ArrayDemoprograma aloca um `array` com memória suficiente para 10 elementos inteiros e atribui o array à umaArray.

```
//cria um array de inteiros
anArray = new int[10];
```

A partir disso podemos inserir os valores e manipula-las.

Alternativamente, podemos usar a sintaxe de atalho para criar e inicializar um array:

```
int[] umaArray = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000
};
```

**OBS :** Aqui, o comprimento da matriz é determinado pelo número de valores fornecidos entre colchetes e separados por vírgulas. Logo, temos uma matriz/ array com 10 indices.


O programa a seguir `ArrayDemo`, cria um array de inteiros, coloca alguns valores no array e imprime cada valor na saída padrão.

```
class ArrayDemo {
    public static void main(String[] args) {
        //declara um array de inteiros
        int[] umaArray;

        //aloca memória para 10 inteiros
        anArray = new int[10];
           
        // inicializa o primeiro elemento
        umaArray[0] = 100;
        // inicializa o segundo elemento
        umaArray[1] = 200;
        // e assim por diante
        umaArray[2] = 300;
        umaArray[3] = 400;

        System.out.println("Elemento no índice 0:"
                           + anArray[0]);
        System.out.println("Elemento no índice 1:"
                           + umArray[1]);
        System.out.println("Elemento no índice 2:"
                           + umArray[2]);
        System.out.println("Elemento no índice 3:"
                           + umaArray[3]);

    }
}

```

**O programa imprimiria isso :**

Elemento no índice 0: 100

Elemento no índice 1: 200

Elemento no índice 2: 300

Elemento no índice 3: 400

Podemos também declarar uma matriz de matrizes (também conhecida como matriz multidimensional ) usando dois ou mais conjuntos de colchetes, como String[][] nomes. Cada elemento, portanto, deve ser acessado por um número correspondente de valores de índice. Na linguagem de programação Java, um array multidimensional é um array cujos componentes são eles próprios arrays. Isso é diferente de arrays em C ou Fortran. Uma consequência disso é que as linhas podem variar em comprimento.

```
class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
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

> São todas as ações, movimentos de nossa aplicação.

>Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

> A estrutura do método é `tipo retorno + nomeDoMétodo + (parametro é opcional)`.

### Critério de definição de métodos

Antes de criarmos nossos métodos, devemos saber algumas finalidades antes da criação.

- Qual a proposta principal do método?
>Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

- O método tem que retornar algum valor?
>Você deve analisar se o método será responsável por retornar algum valor ou não.

- Quais os parâmetros serão necessários para execução do método ?
Os métodos às vezes precisarão de argumentos como critérios para a execução.

- O método possui o risco de apresentar alguma exceção?
>Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

- Qual a visibilidade do método?
> Ele será visível para toda a classe ? toda a pasta ? toda aplicação?

Veremos exemplos de métodos.
```
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}


```

## Convenções e Nomenclaturas (Java Beans)

> Na programação, tudo é relativo. Quando trabalhamos com um código mais simples e curto podemos ter grandes capacidades de organização, porém quanto mais o nosso projeto cresce, mais o nosso código tende a ficar desorganizado. Com isso, seguimos algumas convenções, para auxiliar no entendimento e organização do nosso projeto.

- **Classe** - Devemos sempre nomear a classe e o nome do arquivo, com a inicial Maiúscula! E se a palavra for composta, as iniciais também são maiúsculas!

`public class CalculadoraCientifica {}`

- **Variáveis e Métodos** - Devemos sempre nomear a variável ou o Método com a inicial minúscula e sua composição maiúscula!

**OBS** - Na criação de métodos, é recomendado colocar o nome do método no infinitivo para facilitar a leitura e entendimento do código.

```
double salarioMensal = 1480.00 // Variável do tipo double.
String formatarCep (long cep) // Método que transforma o parâmetro long para String.
void calcularEnviar() // Esse método tem um nome contraditório.(Ele calcula ou envia?)
```

- **Constantes** - Nas constantes devemos sempre nomear com tudo maiúsculo! Assim, um desenvolvedor ja teria ciência que é uma variável constante.

`final int ESTADOS_BRASILEIRO = 27`


## Iniciando na P.O.O 

### O que é um objeto?

> Os objetos são essenciais para a compreensão da tecnologia orientada a objetos. Olhe ao seu redor agora mesmo e você encontrará muitos exemplos de objetos do mundo real: seu cachorro, sua mesa, seu aparelho de televisão, sua bicicleta.

> Os objetos do mundo real compartilham duas características: todos eles têm estado e comportamento . Os cães possuem estado (nome, cor, raça, fome) e comportamento (latir, buscar, abanar o rabo). As bicicletas também têm estado (marcha atual, cadência atual do pedal, velocidade atual) e comportamento (mudança de marcha, mudança de cadência do pedal, aplicação de freios). Identificar o estado e o comportamento de objetos do mundo real é uma ótima maneira de começar a pensar em termos de programação orientada a objetos.


<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-object.gif">
  <source media="(prefers-color-scheme: light)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-object.gif">
  <img alt="Mostra uma ilustração de um objeto." src="https://docs.oracle.com/javase/tutorial/figures/java/concepts-object.gif">
</picture>

> Os objetos de software são conceitualmente semelhantes aos objetos do mundo real: eles consistem em **estado** e **comportamento**. Um objeto armazena seu estado em campos (variáveis) e expõe seu comportamento através de métodos (funções em algumas linguagens de programação). Os métodos operam no estado interno de um objeto e servem como mecanismo principal para comunicação entre objetos. Ocultar o estado interno e exigir que toda a interação seja realizada através dos métodos de um objeto é conhecido como encapsulamento de dados — um princípio fundamental da programação orientada a objetos.

<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bicycleObject.gif">
 	<source media="(prefers-color-screme: light)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bicycleObject.gif">
 	<img alt="Exemplo de um objeto (MOTO)." src="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bicycleObject.gif">
 
</picture>

> Ao atribuir o estado (velocidade atual, cadência atual do pedal e marcha atual) e fornecer métodos para alterar esse estado, o objeto permanece no controle de como o mundo exterior pode usá-lo. Por exemplo, se a bicicleta tiver apenas 6 marchas, um método para mudar de marcha poderia rejeitar qualquer valor menor que 1 ou maior que 6.

### O que é uma classe? 

> No mundo real, muitas vezes você encontrará muitos objetos individuais, todos do mesmo tipo. Pode haver milhares de outras bicicletas, todas da mesma marca e modelo. Cada bicicleta foi construída a partir do mesmo conjunto de projetos e, portanto, contém os mesmos componentes. Em termos de orientação a objetos, dizemos que sua bicicleta é uma **instância** da classe de objetos conhecida como bicicletas. Uma classe é o modelo a partir do qual os objetos individuais são criados.


Toda a estrutura de código, na linguagem Java é distribuído em arquivos, com extensão .java denominados de classe.

As classes existentes em nosso projeto, serão composta por:

Identificador, Características e Comportamentos.

> Classe (class): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.

> Identificador (identity): Propósito existencial aos objetos que serão criados.

> Características (states): Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto.

> Comportamentos (behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto dispõe.

> Instanciar (new): É o ato de criar um objeto a partir de estrutura, definida em uma classe.


<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://cdn.hashnode.com/res/hashnode/image/upload/v1686511238168/bd455403-f1ff-47db-9798-c0d68d5736c5.webp">
 	<source media="(prefers-color-screme: light)" srcset="https://cdn.hashnode.com/res/hashnode/image/upload/v1686511238168/bd455403-f1ff-47db-9798-c0d68d5736c5.webp">
 	<img alt="Exemplo de um objeto (MOTO)." src="https://cdn.hashnode.com/res/hashnode/image/upload/v1686511238168/bd455403-f1ff-47db-9798-c0d68d5736c5.webp">
 
</picture>

Veremos agora, um exemplo de uma classe Bicicleta no java:

```
classe Bicicleta {

    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;

    void mudarCadencia(int novoValor) {
         cadencia = novoValor;
    }

    void mudarMarcha(int novoValor) {
         marcha = novoValor;
    }

    void aumentarVelocidade(int incremento) {
         velocidade = velocidade + incremento;   
    }

    void freiar(int decremento) {
         velocidade = velocidade - decremento;
    }

    void printarStatus() {
         System.out.println("cadencia:" +
             cadencia + "velocidade:" +
             velocidade + "marcha:" + marcha);
    }
}
```

- Os campos cadencia, velocidade, e marcha o estado do objeto, e os métodos ( mudarCadencia, mudarMarcha, aumentarVelocidade etc.) definem sua interação com o mundo exterior.

>[!IMPORTANT]
> Você deve ter notado que a classe Bicicleta não contém um método `main`. Isso porque não é um aplicativo completo; é apenas o modelo de bicicletas que pode ser usado em um aplicativo. A responsabilidade de criar e usar novos objetos da Bicicleta pertence a alguma outra classe da sua aplicação.

Veremos agora, uma outra classe com o método main e executaremos a nossa aplicação.

```
class BicycleDemo { 
    public static void main(String[] args) { 

        // Cria dois 
        // objetos de bicicleta diferentes 
        Bicicleta bike1 = new Bicicleta(); 
        Bicicleta bike2 = new Bicicleta(); 

        // Invoca métodos 
        // nesses objetos 
        bike1.mudarCadencia(50); 
        bike1.aumentarVelocidade(10); 
        bike1.mudarMarcha(2); 
        bike1.printarStatus(); 

        bike2.mudarCadencia(50); 
        bike2.aumentarVelocidade(10); 
        bike2.mudarMarcha(2); 
        bike2.mudarCadencia(40); 
        bike2.aumentarVelocidade(10); 
        bike2.mudarMarcha(3); 
        bike2.printarStatus(); 
    } 
}

```
**OBS** : Veja que criamos 2 objetos proveniente da classe Bicicleta, logo, temos 2 bicicletas. Uma `bike1` e a outra `bike2`.

Seguindo algumas convenções, as nossas classes são classificadas como:

> Classe de modelo (model): classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

> Classe de serviço (service): classes que contém regras de negócio e validação de nosso sistema.

> Classe de repositório (repository): classes que contém uma integração com banco de dados.

> Classe de controle (controller): classes que possuem a finalidade de disponibilizar alguma comunicação externa, à nossa aplicação, como http web ou webservices.

> Classe utilitária (util): classe que contém recursos comuns, à toda nossa aplicação.

<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%252Fimage%2520%287%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=485026aaf1a8fe67c5f89268eef3287feba775ae4d3ef258f8d53c56e3e05272">
 	<source media="(prefers-color-screme: light)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%252Fimage%2520%287%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=485026aaf1a8fe67c5f89268eef3287feba775ae4d3ef258f8d53c56e3e05272">
 	<img alt="Container das Classes" src="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%252Fimage%2520%287%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=485026aaf1a8fe67c5f89268eef3287feba775ae4d3ef258f8d53c56e3e05272">
 
</picture>


## Pacotes

> Um pacote é um namespace que organiza um conjunto de classes e interfaces relacionadas. Conceitualmente, você pode pensar nos pacotes como sendo semelhantes a diferentes pastas do seu computador. Você pode manter páginas HTML em uma pasta, imagens em outra e scripts ou aplicativos em outra. Como o software escrito na linguagem de programação Java pode ser composto de centenas ou milhares de classes individuais, faz sentido manter tudo organizado colocando classes e interfaces relacionadas em pacotes.

A plataforma Java fornece uma enorme biblioteca de classes (um conjunto de pacotes) adequada para uso em suas próprias aplicações. Esta biblioteca é conhecida como "Interface de Programação de Aplicativo" ou "API", abreviadamente. Seus pacotes representam as tarefas mais comumente associadas à programação de uso geral. Por exemplo, um objeto `String` contém estado e comportamento para cadeias de caracteres.

> Existem literalmente milhares de classes para você escolher. Isso permite que você, programador, se concentre no design de seu aplicativo específico, em vez de na infraestrutura necessária para fazê-lo funcionar.


<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-85650fe21efc214012ba8e0ef7d5374464f2fe59%252Fimage%2520%2818%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=904266bb930eb6bdbbb21e0f79d60f8f60a90c7e51ef88eb317cbab3cee467f7">
 	<source media="(prefers-color-screme: light)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-85650fe21efc214012ba8e0ef7d5374464f2fe59%252Fimage%2520%2818%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=904266bb930eb6bdbbb21e0f79d60f8f60a90c7e51ef88eb317cbab3cee467f7">
 	<img alt="Container das Classes" src="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-85650fe21efc214012ba8e0ef7d5374464f2fe59%252Fimage%2520%2818%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=904266bb930eb6bdbbb21e0f79d60f8f60a90c7e51ef88eb317cbab3cee467f7">

</picture>

### Nomenclatura

Vamos imaginar, que sua empresa se chama Power Soft e ela está desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

- Comercial : com.powersoft;

- Governamental : gov.powersoft;

- Código aberto: org.powersoft.


Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda mais um pouco as nossas classes, mediante a proposta de sua existência:

- model : Classes que representam a camada e modelo da aplicação : Cliente, Pedido, NotaFiscal, Usuario;

- repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;

- service: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do cliente cadastrado;

- controller: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras aplicações via padrão HTTP;

- view: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;

- util: Pacote que contém, classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

### Identificação

Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (próprio nome) e agora o nome qualificado (endereçamento do pacote + nome), exemplo: Considere a classe Usuario, que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é `com.controle.acesso.model.Usuario.`

## Modificadores 

Em Java, utilizamos três palavras reservadas e um conceito default (sem nehuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes.

### Modificador Public 

Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.



<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-11e169f025fbf09ce369a6166a354d12c7a2f794%252Flanchonete_1.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=96464960b690f023c20cc2106819cba854916d8c0f73d041edd3656fe98fe5e9">
 	<source media="(prefers-color-screme: light)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-11e169f025fbf09ce369a6166a354d12c7a2f794%252Flanchonete_1.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=96464960b690f023c20cc2106819cba854916d8c0f73d041edd3656fe98fe5e9">
 	<img alt="Container das Classes" src="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-11e169f025fbf09ce369a6166a354d12c7a2f794%252Flanchonete_1.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=96464960b690f023c20cc2106819cba854916d8c0f73d041edd3656fe98fe5e9">

</picture>


Neste exemplo acima, temos uma imagem de uma lanchonete, no qual toda sua área pode ser vista por todos na lanchonete.O que fica uma pergunta... Será que tudo precisa ser visto?

### Modificador Default

O modificador `default`, está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.

Dentro do pacote lanchonete, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

> lanchonete.atendimento.cozinha: Pacote que contém classes, da parte da cozinha da lanchonete e atendimentos.

> lanchonete.area.cliente: Pacote que contém classes, relacionadas ao espaço do cliente.



<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-1fdf089ebb01ef7239344fbeae3dbf9ca71c1db0%252Fpacotes.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=62700f25ee79027f5cc0c161122c7e44cee300b12f9b5a7f0ec910706cfb19cb">
 	<source media="(prefers-color-screme: light)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-1fdf089ebb01ef7239344fbeae3dbf9ca71c1db0%252Fpacotes.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=62700f25ee79027f5cc0c161122c7e44cee300b12f9b5a7f0ec910706cfb19cb">
 	<img alt="Container das Classes" src="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-1fdf089ebb01ef7239344fbeae3dbf9ca71c1db0%252Fpacotes.png%3Falt%3Dmedia&width=768&dpr=4&quality=100&sign=62700f25ee79027f5cc0c161122c7e44cee300b12f9b5a7f0ec910706cfb19cb">

</picture>

Agora, temos uma área onde apenas os Clientes podem ver e uma área onde apenas os funcionarios da lanchonete conseguem ver e ter acesso.

**OBS :** Para definir um método visível a nível de pacote, basta **NÃO** declarar nenhum modificador.

### Modificador protected

Esse modificador é utilizado quando desejamos bloquear o acesso para as outras classes, porém, queremos deixar as classes filhas ou pais com o acesso. Logo, utilizado apenas para herança.

### Modificador Private

O modificador `private`, está fortemente associado apenas as classes, logo, não podendo ser acessado por nenhuma outra classe.

## Getters e Setters

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.

> O método Getter, retorna o valor do atributo especificado.

> O método Setter, define outro novo valor para o atributo especificado.

```
// arquivo Aluno.java
public class Aluno {
	String nome;
	int idade;
}

// arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.nome="Felipe";
		felipe.idade = 8;
		
		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}
}
```

**Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:**

Os atributos precisam ter o modificador de acesso `private`. Ex.: `private String nome`;

Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: `getNome()` e `setNome(String novoNome)`;

O método get, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, Ex.: `public String getNome() {}`;

O método set, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. Ex.: `public void setNome(String newNome)`;

Veremos agora um exemplo com getters and setters, com o mesmo programa do exemplo anterior...

```
//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	}
}
```


## Método Construtor

Sabemos que, para criar um objeto na linguagem Java, utilizamos a seguinte estrutura de código:

`Classe novoObjeto = new Classe();`

Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.

```
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
```

Como não temos os setters, para inserir novos valores a variáveis, podemos utilizar os construtores para passar esses valores.

```
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//...
	//getters
	//setters
}
```

**OBS :** Os métodos construtores **SEMPRE** deve ter o mesmo nome da classe.

Agora, com o método construtor criado, podemos instanciar essa classe e passar os parâmetros que selecionamos.

```
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//continua ...
		
	}
}

```

Com isso, passamos os paramêtros para o objeto criado.


## Pilares da P.O.O

### Encapsulamento

O encapsulamento é a habilidade de esconder as características intrínsecas de um dado objeto de outros objetos. É a técnica de proteger os dados (atributos) e os códigos que operam sobre os dados (métodos) em uma única unidade chamada classe. Além disso, o encapsulamento protege os dados de um objeto contra acesso direto de fora da classe, expondo apenas métodos seguros para operação sobre esses dados.

```
public class MSNMessenger {
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem");
		
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
		
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privados, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
```
Neste exemplo, vemos um código sobre um aplicativo de mensagens. Temos alguns métodos que são executados para enviar mensagem, como salvarHistoricoMensagem() e validarConectadoInternet(). São métodos que o usuário não é necessário ver ou ter acesso. Com isso, podemos encapsular esses métodos, de forma com que sejam executados sem ser visto ou acessado pelo usuário.

## Herança

 A programação orientada a objetos permite que as classes herdem estados e comportamentos comumente usados ​​de outras classes. Neste exemplo, Bicycle  torna-se a superclasse de BMX, Bicicleta de Corrida e Bicicleta dupla. Na linguagem de programação Java, cada classe pode ter uma superclasse direta, e cada superclasse tem potencial para um número ilimitado de subclasses :
 
<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bikeHierarchy.gif">
 	<source media="(prefers-color-screme: light)" srcset="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bikeHierarchy.gif">
 	<img alt="Herança de classes" src="https://docs.oracle.com/javase/tutorial/figures/java/concepts-bikeHierarchy.gif">
 
</picture> 

Neste exemplo acima, temos a superclasse `Bicicleta`, que pode ter subclasses que tendem a ter estados ou comportamentos diferentes. 
A sintaxe para criar uma subclasse é simples. No início da declaração de sua classe, use a  palavra-chave `extends`, seguida do nome da classe da qual herdar:

```
class MountainBike extends Bicicleta {

    // novos campos e métodos definindo
    // uma mountain bike iria aqui

}

```

> Isso fornece a MountainBike todos os mesmos campos e métodos do Bicicleta, mas permite que seu código se concentre exclusivamente nos recursos que o tornam único. Isso torna o código de suas subclasses fácil de ler. Porém, você deve ter o cuidado de documentar adequadamente o estado e o comportamento que cada superclasse define, pois esse código não aparecerá no arquivo fonte de cada subclasse.

## Abstração

A abstração é o processo de ocultar os detalhes complexos e mostrar apenas as características essenciais de um objeto ou sistema. Permite aos desenvolvedores concentrar-se no que um objeto faz, em vez de como ele faz. A abstração envolve a simplificação de objetos complexos do mundo real para representá-los de forma mais simples no código.

Esse pilar é alcançado definindo classes que representam tipos abstratos de comportamento e características. Por exemplo, uma classe “Carro” pode incluir atributos como “marca”, “modelo” e “cor”, e métodos como “ligar” e “acelerar”, sem necessariamente detalhar os mecanismos internos que permitem ao carro realizar essas funções.

Com isso, temos em mente que classes abstratas vão sempre utilizar métodos com corpo vazio, pois ela não sabe como fazer. Definimos as funções na própria classe.

```
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}
```

Essa classe abstrata ela define os métodos, e todas as suas subclasses devem conter esses métodos e defini-los.

```
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}

```

Neste exemplo, vemos uma classe filha que herda os métodos da classe abstrata e define suas funções.

**OBS :** É importante saber que a classe filha **TEM** que ter todas as funções declaradas da classe abstrata, caso contrário, haverá um erro de compilação.

> Quando falamos de abstração, é impossível não falarmos também do próximo pilar... Polimorfismo.


## Polimorfismo

O polimorfismo, que significa “muitas formas”, é a capacidade de um método para fazer coisas diferentes com base no objeto que o invoca. É a propriedade de duas ou mais classes derivadas de uma mesma superclasse responderem a mesma mensagem, mas cada subclasse de uma forma diferente da outra classe derivada.

Ou seja, podemos ter diversas formas de fazer uma ação. Um exemplo de um carro, quando lembramos do objeto carro, vem a mente, cor, volante,marcha,velocidade.... Em todos os carros isso tem, porém são trabalhados de maneiras diferentes em cada um, e isso é o polimorfismo.


<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%252Fimage%2520%289%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=8d55bf918ff095b6c097fd7c320b5da6901754f17a20e47be28364f5a7c14cfd">
 	<source media="(prefers-color-screme: light)" srcset="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%252Fimage%2520%289%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=8d55bf918ff095b6c097fd7c320b5da6901754f17a20e47be28364f5a7c14cfd">
 	<img alt="Herança de classes" src="https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%252Fimage%2520%289%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=8d55bf918ff095b6c097fd7c320b5da6901754f17a20e47be28364f5a7c14cfd">
 
</picture> 

Nesta figura, vemos um método abstrato com uma função calcular_Perimetro(), que no qual não sabe como fazer essa função. Porém, suas subclasses, cada uma tem uma forma de utilizar e fazer essa função declarada pela classe abstrata.

**OBS :** Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas, determinem ações uniformes, para que cada classe filha concreta, implemente os comportamentos de forma específica.





## Interface 

O que é uma interface? 

Podemos definir como interface o contrato entre a classe e o mundo exterior. Quando uma classe implementa uma interface, se compromete a fornecer o comportamento publicado por esta interface. As classes ajudam a definir um objeto e seu comportamento e as interfaces que auxiliam na definição dessas classes. As interfaces são formadas pela declaração de um ou mais métodos, os quais obrigatoriamente não possuem corpo.

**OBS :** Como vimos anteriormente, Herança é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida, na linguagem Java, é que a mesma não permite o que conhecemos como **Herança Múltipla.**

Caso desejarmos herdar multiplas classes, precisariamos transformar essas classes em interfaces.


Na sua forma mais comum, uma interface é um grupo de métodos relacionados com corpos vazios. O comportamento de uma bicicleta, se especificado como uma interface, pode ser o seguinte:

```
interface Bicicleta {

    // rotações da roda por minuto
    void mudarCadencia(int novoValor);

    void mudarMarcha(int novoValor);

    void aumentarVelocidade(int incremento);

    void freiar(int decremento);
}
```

Para implementar essa interface, o nome da sua classe mudaria (para uma determinada marca de bicicleta, por exemplo, como Bicicleta Caloi) e você usaria a palavra-chave `implements` na declaração da classe:

```
class BicicletaCaloi implements Bicicleta {

    cadência interna = 0;
    velocidade interna = 0;
    marcha interna = 1;

   // O compilador agora exigirá que os métodos
   // mudarCadencia, mudarMarcha, aumentarVelocidade e freiar.
   // tudo será implementado. A compilação falhará se aqueles
   // métodos estão faltando nesta classe.

    void mudarCadencia(int novoValor) {
         cadência = novoValor;
    }

    void mudarMarcha(int novoValor) {
         marcha = novoValor;
    }

    void aumentarVelocidade(int incremento) {
         velocidade = velocidade + incremento;   
    }

    void freiar(int decremento) {
         velocidade = velocidade - decremento;
    }

    void printStates() {
         System.out.println("cadência:" +
             cadência + "velocidade:" +
             velocidade + "marcha:" + marcha);
    }
}
```

**OBS :** A implementação de uma interface permite que uma classe se torne mais formal em relação ao comportamento que promete fornecer. As interfaces formam um contrato entre a classe e o mundo exterior, e esse contrato é aplicado no momento da construção pelo compilador. Se sua classe pretende implementar uma interface, todos os métodos definidos por essa interface deverão aparecer em seu código-fonte antes que a classe seja compilada com êxito.
 
**Um objeto de um tipo definido por uma interface não pode ser instanciado de forma alguma.** 

Os membros declarados em uma interface são implicitamente públicos. Neste ponto, devemos considerar que não é permitido declarar variáveis em uma interface, isto em virtude desta ser uma implementação do atributo de um objeto.

```
public class Funcionario
    {
        interface IReajuste
        {
            double Reajuste();
        }

        public class ReajusteFuncionario : IReajuste
        {
            //Propriedades públicas da minha classe
            public string nomeFuncionario;
            public double salarioFuncionario;

            //Implementação do método Reajuste, da interface IReajuste
            public double Reajuste()
            {
                salarioFuncionario = salarioFuncionario * 1.50;

                return salarioFuncionario;
            }
        }
    }
```

Percebam que minha interface tinha um método em seu escopo. Usamos esse método na classe, que herda dessa interface. Assim é estabelecido um “contrato” entre a interface, que definiu o método Reajuste() e a classe, que herdou sua implementação usando seu método criado anteriormente.



## Materiais de Estudos

[Collections Framework Java](src/edu/lucas/collections/README.md)

[List - Collections Framework Java](src/edu/lucas/collections/exerciciosList/ListsREADME.md)

## Referências

Essa documentação teve base em vários materiais de estudos.

> [Gitbook Java Básico](https://glysns.gitbook.io/java-basico)

> [W3Schools](https://www.w3schools.com/java/)

>[Learn Java](https://dev.java/learn/)

>[Java Documentation](https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html)

>[Java API'S Overview](https://docs.oracle.com/javase/8/docs/api/index.html)



