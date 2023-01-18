public class Usuario {
    public static void main(String[] args) throws Exception {
        
            SmarTv smartTv = new SmarTv();

            System.out.println("TV ligada? " + smartTv.ligada);
            System.out.println("Canal " + smartTv.canal);
            System.out.println("Volume " + smartTv.volume);


            smartTv.ligar();
            System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            System.out.println("Volume " + smartTv.volume);

            smartTv.mudarCanal(5);
            smartTv.aumentarCanal();
            smartTv.diminuirCanal();
            System.out.println("Canal " + smartTv.canal);

        

     }
}
