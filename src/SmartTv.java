public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligada = true;
    }
    public void deligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    /**
     * mudar para o canal indicado via parametro
     * @param canal
     */
    public void mudarCanal(int canal){
        this.canal = canal;
    }
}
