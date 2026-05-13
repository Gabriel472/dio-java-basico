package edu.gabriel.primeiromodulo.projetos;

public class MetodosProjetoSmartTvUsuario {
    public static void main(String[] args) throws Exception{
        MetodosProjetoSmartTv smartTv = new MetodosProjetoSmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.abaixarCanal();
        smartTv.abaixarCanal();

        System.out.println("Canal " + smartTv.canal + ".");
        smartTv.mudarCanal(5);
        System.out.println("Canal " + smartTv.canal + ".");
    }
}