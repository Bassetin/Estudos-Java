package edu.lucas.variaveis;
import java.util.Scanner;

public class MinhaVariavel {
 
    

    public static void main (String[] args){ 
    Scanner s = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    String opcoes = "Somar", "Sub","Div","Mult";
    int resultado;

    System.out.println("Digite uma opção:");
    String opcoes = s.nextLine();


    switch (opcoes) {

        case "Somar" : 
            resultado = num1 + num2;
             System.out.println(resultado);
            break;

        case "Sub" :
            resultado = num1 - num2;
             System.out.println(resultado);
            break;

        case "Div" :
            resultado = num1 / num2;
             System.out.println(resultado);
            break;

        case "Mult" :
            resultado = num1 * num2;
              System.out.println(resultado);
            break;

        default :    
            System.out.println("Essa operação não existe");
            break;
            
            

        

        
    }





    }


}
