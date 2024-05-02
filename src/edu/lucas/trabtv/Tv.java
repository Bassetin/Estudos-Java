package edu.lucas.trabtv;

public class Tv {
    boolean ligadaDesligada = true;
    int canal = 1;
    int volume = 1;

    boolean ligarOuDesligar (){
            if (ligadaDesligada == false) {
                ligadaDesligada = true;
            }else{
            ligadaDesligada = false;
    }
        return ligadaDesligada;
    }

    int aumentarCanal (){
            canal++;
        return canal;
    }

    int diminuirCanal (){
            canal--;
        return canal;
    }

    int aumentarVolume (){
            volume++;
        return volume;
    }

    int diminuirVolume (){
            volume--;
        return volume;
    }


    public static void main(String [] args){

        Tv obj = new Tv();
        obj.aumentarCanal();
        System.out.println(obj.canal);
        obj.aumentarVolume();
        System.out.println(obj.volume);
        obj.diminuirCanal();
        System.out.println(obj.canal);
        obj.diminuirVolume();
        System.out.println(obj.volume);
        obj.ligarOuDesligar();
        System.out.println(obj.ligadaDesligada);

        System.out.println(obj.ligadaDesligada);

    }
}
