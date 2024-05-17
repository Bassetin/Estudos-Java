package edu.lucas.collections.exerciciosList.pesquisa.exemplos.soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numeroParaAdicionar){
        this.listNumeros.add(numeroParaAdicionar);

    }

    public int calcularSoma(){
        int resultadoSoma = 0;
        if(!listNumeros.isEmpty()){
            for(Integer numero : listNumeros ){
                resultadoSoma += numero;
            }
        }
        return resultadoSoma;

    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listNumeros.isEmpty()) {
            for (Integer i : listNumeros) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){

        int menorNumero = Integer.MAX_VALUE;
        if (!listNumeros.isEmpty()){
            for(Integer i : listNumeros){
                if (i <= menorNumero){
                    menorNumero = i;
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
        return  menorNumero;
    }

    public void exibirNumeros(){
        if(!listNumeros.isEmpty()){
            System.out.println(this.listNumeros);

        }
        else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }


}
