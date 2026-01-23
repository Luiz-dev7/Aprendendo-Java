public class SmartTv {

    boolean ligada = false;
    int canal = 2;
    int volume = 25;

    public void Ligar() {
        ligada = true;
    }

    public void Desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        //aumentando o volume em 1
        volume++;
        System.out.println("Aumentando o som para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o som para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void AumentarCanal() {
        canal++;
        System.out.println("Canal aumentado para: " + canal);
    }


}
