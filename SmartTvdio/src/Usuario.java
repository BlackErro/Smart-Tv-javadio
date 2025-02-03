public class Usuario {
    public static void main(String[] args)  throws Exception{

        SmartTvdio smartTvdio = new SmartTvdio();

        System.out.println("Tv ligada ? " + smartTvdio.ligada);
        System.out.println("Canal atual : " + smartTvdio.canal);
        System.out.println("Volume Atual : " + smartTvdio.volume);

        smartTvdio.ligar();
        System.out.println(" Novo Status -> Tv ligada ? " + smartTvdio.ligada);

        smartTvdio.desligar();
        System.out.println(" Novo Status -> Tv ligada ? " + smartTvdio.ligada);

        smartTvdio.almentarVolume();
        System.out.println("Volume Atual : " + smartTvdio.volume);

        smartTvdio.abaixarVolume();
        System.out.println("Volume Atual : " + smartTvdio.volume);

        System.out.println("Canal atual : " + smartTvdio.canal);

        smartTvdio.mudardeCanal(13);

        System.out.println("Canal atual : " + smartTvdio.canal);

        smartTvdio.aumentarCanal();
        System.out.println("Canal atual : " + smartTvdio.canal);

    }
    
}
