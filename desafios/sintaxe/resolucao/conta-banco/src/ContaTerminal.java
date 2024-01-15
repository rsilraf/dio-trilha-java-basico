import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;
        var scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print("Por favor, digite seu nome: ");
        scanner.nextLine();
        nome = scanner.nextLine();
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n"
            , nome, agencia, numero, saldo
        );
        scanner.close();
    }
}
