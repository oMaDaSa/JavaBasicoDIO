import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá " + nome + " " + sobrenome);
        SmartTv tv = new SmartTv();
        tv.ligar();
        System.out.println("Ligada: " + tv.ligada);
        System.out.println("Volume: " + tv.volume);
        for(int i = 0; i < 10; i++){
            tv.diminuirVolume();
            System.out.println("Volume: " + tv.volume);
        }
        System.out.println("Canal: " + tv.canal);
        System.out.print("Insira o canal desejado: ");
        int novoCanal = scanner.nextInt();

        tv.mudarCanal(novoCanal);
        System.out.println("Canal: " + tv.canal);
    }
}
