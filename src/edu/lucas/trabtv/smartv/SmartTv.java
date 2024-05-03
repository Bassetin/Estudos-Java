package edu.lucas.trabtv.smartv;

public class SmartTv {

    // DECLARAÇÃO DAS VARIÁVEIS
    public boolean ligada = true;
    public int canal = 1;
    public int volume = 1;

    // DECLARAÇÃO DOS MÉTODOS

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal (){
        canal++;
    }

    public void diminuirCanal (){
        canal--;
    }

    public int selecionarCanal (int novoCanal){
        canal = novoCanal;
        return canal;
    }

    public void aumentarVolume (){
        volume++;
        System.out.println("Aumentando o volume para :" + volume);
    }

    public int diminuirVolume (){
        volume--;
        System.out.println("Diminuindo o volume para :" + volume);
        return volume;
    }
}
