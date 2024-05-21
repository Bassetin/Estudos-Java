# Collections Framework Java (LIST)


## List 

O List é uma interface e o `ArrayList` é a classe que a implementa.

> Veja o exemplo do código abaixo


```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DevmediaList {

       /**
        * @param args
        */
       public static void main(String[] args) {

             /*
              * Declaremos nosso objeto sem nenhuma instância
              *
              * */
             List carros;

             /*
              * Criamos uma instância qualquer para o nosso objeto
              * do tipo List, sendo que essa instância deve
               * obrigatoriamente implementar a interface List.
              * Veja as possibilidades
              * */
             carros = new ArrayList();
             carros = new LinkedList();

             //e assim por diante...


       }

}

```

**Então você pode questionar:** Porque não fazer um `ArrayList carros = new ArrayList();` sem usar as interfaces?
**Por uma questão muito simples:** você precisa garantir a flexibilidade da sua aplicação, garantir que o mesmo objeto possa ser instanciado de maneiras distintas em pontos distintos da aplicação. 
Como você tem uma interface List, você tem certeza dos métodos que seu objeto tem, mesmo que ele seja instanciado por uma classe como `ArrayList` ou `LinkedList`. 

> Vamos melhorar um pouco mais nosso código, adicionando o uso de `Generics`.


```
import java.util.ArrayList;
import java.util.List;


public class DevmediaList {

     /**
      * @param args
      */
     public static void main(String[] args) {

           /*
            * Agora adicionamos um Generic "<Carro>", assim só podemos
            * adicionar objetos do tipo 'Carro' nossa lista.
            *
            * */
           List<Carro> carros;

           /*
            * Criamos uma ArrayList apenas com carros
            * */
           carros = new ArrayList<Carro>();


           /*
            * Você conseguirá criar sem problemas um ArrayList
            * sem passar o tipo Generic, mas a IDE irá dar um
             * Warning dizendo que você deveria passar um
            * tipo Generic, para evitar erros em runtime.
            * */
           carros = new ArrayList();

           /*
            * O código abaixo não será compilado, erro em tempo de
            * design. Pois nosso objeto 'carros' agora é muito
             * exigente: Só aceita implementações de List que tenham
            * objetos do tipo 'Carro'. Estamos tentando fazer
             * um 'cast' de Animal para Carro e
            * isso não possível.
            * */
           carros = new ArrayList<Animal>();

     }

}

```

**OBS:** O generics é utilizado para evitar erros de tempo de execução, utilizados para dizer que só um tipo de valor / tipo é aceito por determinado atributo. Ex.: <Carro> Estamos dizendo que o atributo carros, apenas recebe tipos de classe igual a Carro.

> Para finalizar o uso do `List`, vamos mostrar alguns métodos muito utilizados no dia a dia.


- `.add()` - Insere informações/valores na lista.

- `.add(0,**)` - Insere informações/ valores no lugar escolhido.

- `addAll()` - Insere todas informações/ valores de uma lista.

- `.remove()` - Remove informações/valores na lista.

- `.contains()` - Verifica se o elemento selecionado está contido ou não na lista.

- `clear()` - Limpa/ remove todos os elementos de uma lista.






```
import java.util.ArrayList;
import java.util.List;


public class DevmediaList {

   /**
    * @param args
    */
   public static void main(String[] args) {

         List<Carro> carros = new ArrayList<Carro>();
         List<Carro> carrosNovos = new ArrayList<Carro>();

         Carro carro = new Carro();

         //adiciona um carro a nossa lista
         carros.add(carro);

         //adiciona um carro a uma posição exata da lista
         carros.add(10, carro);

         /*
          * Imagine que desejamos adicionar uma lista de
           * carros novos a nossa lista de carros,
          * podemos adicionar todos de uma só vez, usando o 'addAll'
          * */
         carros.addAll(carrosNovos);

         /* Caso prefira, pode usar um for para adicionar
          * os carrosNovos.Nosso laço FOR abaixo, tem a mesma
           * função do addAll.
         */
         for(int i = 0 ; i < carrosNovos.size(); i++){
                carros.add(carrosNovos.get(i));
         }

         /*
          * Verifica se o carro está na lista de carros.
           * Mas como essa verificação é feita ?
          * Através do método 'equals' do seu objeto carro.
           * Sendo assim, na implementação do
          * seu bean 'Carro', é muito importante que você
           * sobreescreva o método 'equals' dizendo
          * como as comparações devem ser realizadas.
          * */
         carros.contains(carro);

         //Remove todos os elementos da lista
         carros.clear();

   }

}

```





