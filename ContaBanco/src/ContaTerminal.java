import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite Seu nome: ");
    String nomeCliente = scanner.next();

    System.out.println("Digite o número da sua conta: ");
    int numeroConta = scanner.nextInt();

    System.out.println("Digite a agência do seu banco: ");
    String numeroAgencia = scanner.next();

    System.out.println("Digite seu saldo: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia+ " , conta "+ numeroConta + " , e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
