public class User {
    public static void main(String[] args) {

        // Instancia um objeto da classe SmartTV
        SmartTV smartTv = new SmartTV();

        // Imprime o estado inicial da smartTV
        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        // Sequencia de comandos que alteram o estado da smartTV
        smartTv.ligarDesligar();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(56);
        smartTv.diminuirCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        // Estado atual da smartTV
        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);


        smartTv.ligarDesligar(); // Desligar SmartTV
        
    }
}
