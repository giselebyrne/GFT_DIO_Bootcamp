public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está Ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv está ligada? " + smartTv.ligada);

        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo Canal: " + smartTv.canal);
        smartTv.diminuirCAnal();
        System.out.println("Novo Canal: " + smartTv.canal);
    }
}
