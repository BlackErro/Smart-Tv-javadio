public class SmartTvdio {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void mudardeCanal( int novoCanal){
        canal = novoCanal;

    }

    public void aumentarCanal(){
        canal ++;

    }

    public void diminuirCanal(){
        canal --;

    }

    public void almentarVolume (){
        volume  ++;
    }

    public void abaixarVolume (){
        volume  --;
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

}
