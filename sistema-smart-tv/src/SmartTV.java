public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
    
    public void aumentarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: +1");
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: -1");
    }

    public void ligarDesligar() {
        ligada = !ligada;
        System.out.println(ligada ? "Tv ligada" : "Tv desligada"); 
    }
}
