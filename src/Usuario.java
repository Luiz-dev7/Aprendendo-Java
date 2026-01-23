public class Usuario {
    public static void main (String [] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

       

        smartTv.Ligar();
        System.out.println("Novo status -> a tv está ligada? " + smartTv.ligada);

        smartTv.mudarCanal(20);
         System.out.println("Canal atual: " + smartTv.canal);

    }



}
