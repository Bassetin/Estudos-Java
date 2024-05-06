package edu.lucas.Projetos.DesafioControleFluxo;

import edu.lucas.Projetos.DesafioControleFluxo.exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int parametroUm = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            int parametroDois = scan.nextInt();
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro! ");

        }catch (InputMismatchException e){
            System.out.println("Foi digitado um valor incorreto... Por favor, digite um número! ");
        }




        }
     static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;


        while(contagem != 0){
            System.out.println("Imprimindo o número : " + contagem);
            contagem--;

        }



       }
}