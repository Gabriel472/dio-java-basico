package edu.gabriel.primeiromodulo.projetos;

public class MetodosProjetoSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }
    public void abaixarVolume(){
        volume--;
        System.out.println("Volume abaixado para " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal " + canal);
    }

    public void abaixarCanal(){
        canal--;
        System.out.println("Canal " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}