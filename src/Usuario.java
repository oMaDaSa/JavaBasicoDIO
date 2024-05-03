public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.ligar();
        System.out.println("Ligada: " + tv.ligada);
        System.out.println("Volume: " + tv.volume);
        for(int i = 0; i < 10; i++){
            tv.diminuirVolume();
            System.out.println("Volume: " + tv.volume);
        }
        System.out.println("Canal: " + tv.canal);
        tv.mudarCanal(42);
        System.out.println("Canal: " + tv.canal);
    }
}
