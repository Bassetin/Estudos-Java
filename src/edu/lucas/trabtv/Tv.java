package edu.lucas.trabtv;

import edu.lucas.trabtv.smartv.SmartTv; // CLASSE SMARTV

public class Tv {




    public static void main(String [] args){

        // INSTANCIANDO A SMARTV PARA PODER TRABALHAR NOS SEUS MÉTODOS E VARIÁVEIS.

        SmartTv obj = new SmartTv();

        //IMPRIMINDO O STATUS ATUAL DAS VARIÁVEIS.
        System.out.println("A tv está :" +  obj.ligada);
        System.out.println("O volume da tv está em :" +  obj.volume);
        System.out.println("A tv está no canal :" +  obj.canal);

        //CHAMANDO MÉTODOS
        obj.aumentarCanal();
        obj.aumentarCanal();
        obj.selecionarCanal(14);
        obj.aumentarVolume();
        obj.aumentarVolume();
        obj.diminuirVolume();
        obj.desligar();


        //VERIFICANDO NOVAMENTE O STATUS DAS VARIÁVEIS
        System.out.println("A tv está :" +  obj.ligada);
        System.out.println("O volume da tv está em :" +  obj.volume);
        System.out.println("A tv está no canal :" +  obj.canal);





    }
}
