import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        System.out.println("Agora digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo disponível: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
