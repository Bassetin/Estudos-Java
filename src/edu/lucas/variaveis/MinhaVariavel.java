package edu.lucas.variaveis;
import java.util.Scanner;

public class MinhaVariavel {
 
    

    public static void main (String[] args){ 
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o seu nome:");
    String nome = "";
    nome = s.nextLine();

    int num1 = 0;
    int num2 = 0;
    System.out.println("Digite um número:");
    num1 = s.nextInt();

    System.out.println("Digite outro número");
    num2 = s.nextInt();

    int opcoes;

    int resultado;

    System.out.println("Digite uma opção:");
    System.out.println("1 - somar,2 - multiplicar, 3 - divisão e 4 - subtração.");

    opcoes = s.nextInt();



    switch (opcoes) {

        case 1:
            resultado = num1 + num2;
             System.out.println(nome + "O resultado é :" + resultado);
            break;

        case 2 :
            resultado = num1 - num2;
            System.out.println(nome + "O resultado é :" + resultado);
            break;

        case 3:
            resultado = num1 / num2;
            System.out.println(nome + "O resultado é :" + resultado);
            break;

        case 4 :
            resultado = num1 * num2;
            System.out.println(nome + "O resultado é :" + resultado);
            break;

        default:
            System.out.println("Essa operação não existe");
            break;
    }





    }


}
