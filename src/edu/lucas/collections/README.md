# Collections Framework Java

Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection.  Estes elementos precisão ser Objetos.

Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo especifico.

**A Collections Framework contém os seguintes elementos:**

- **Interfaces:**  Tipos abstratos que representam as coleções. Permitem que coleções sejam manipuladas tendo como base o conceito “Programar para interfaces e não para implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces;

- **Implementações:** São as implementações concretas das interfaces;

- **Algoritmos:** São os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação.


**OBS :** Temos quatro grandes tipos de coleções: `List` (lista), `Set` (conjunto), `Queue` (fila) e `Map` (mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

> A **imagem abaixo** mostra a árvore da hierarquia de interfaces e classes da Java Collections Framework que são derivadas da interface Collection. O diagrama usa a notação da UML, onde as linhas cheias representam `extends` e as linhas pontilhadas representam `implements`.


<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg">
 	<source media="(prefers-color-screme: light)" srcset="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg">
 	<img alt="Árvore Collections" src="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg">

</picture> 

A hierarquia da Collections Framework tem uma segunda árvore. São as classes e interfaces relacionadas a `mapas`, que não são derivadas de Collection, como mostra a **imagem abaixo**. Essas interfaces, mesmo não sendo consideradas coleções, podem ser manipuladas como tal.

<picture>
	<source media="(prefers-color-scheme: dark)" srcset="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image002.jpg">
 	<source media="(prefers-color-screme: light)" srcset="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image002.jpg">
 	<img alt="Árvore Maps" src="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image002.jpg">

</picture> 

**Embora a interface `Map` não ser filha direta da interface `Collection` ela também é considerada uma coleção devido a sua função.**


## Interfaces

**Neste momento vamos apresentar uma breve descrição de cada uma das interfaces da hierarquia:**

- **Collection** – está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;


- **Set** – interface que define uma coleção que não permite elementos duplicados. A interface `SortedSet`, que estende `Set`, possibilita a classificação natural dos elementos, tal como a ordem alfabética;


- **List** – define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;


- **Queue** – um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;


- **Map** – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. `SortedMap` é uma interface que estende `Map`, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.


**OBS :** Observe que usamos acima os termos *ordenação* e *classificação*. Dizemos que uma estrutura está ordenada se ela pode ser percorrida (iterada) em uma certa ordem, tal como os itens de um `ArrayList` podem ser percorridos através de seus índices. Por sua vez, a classificação diz respeito à ordenação na essência dos dados, tal como a classificação em ordem alfabética de `Strings` ou ordem numérica das classes `wrapper`, como `Integer` e `Double`, por exemplo. Podemos afirmar que uma estrutura classificada é uma estrutura ordenada, mas o inverso não é verdadeiro.

**A API oferece também interfaces que permitem percorrer uma coleção derivada de Collection. Neste artigo falaremos de:**

- `Iterator` – possibilita percorrer uma coleção e remover seus elementos;

- `ListIterator` – estende `Iterator` e suporta acesso bidirecional em uma lista, modificando e/ou removendo elementos.


## Implementações

**As interfaces apresentadas anteriormente possuem diversas implementações que são utilizadas para armazenar as coleções. Na **Tabela abaixo** estão resumidas as implementações mais comuns.**


