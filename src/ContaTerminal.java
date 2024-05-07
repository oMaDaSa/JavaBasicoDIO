import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o Número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite a Agência: ");
        agencia = scanner.nextLine();
        System.out.print("Por favor, digite o Nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o Saldo: ");
        saldo = Double.parseDouble(scanner.next());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
