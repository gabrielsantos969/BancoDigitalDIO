import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Gabriel Santos
 * @since 04/05/2024
 * @version 1.0.0
 */
public class ContaTerminal {

    public static void main(String[] args)throws InterruptedException{

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;


        System.out.print("Seja bem-vindo(a) ao banco digital DIO!!");

        System.out.print("\nMe informe o número da sua conta: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Me informe agora a sua agencia: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.print("Me informe agora os seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Qual valor deseja depositar? R$ ");
        double saldoParaDepositar = scanner.nextDouble();

        saldo += saldoParaDepositar;

        showLoadingAnimation(nomeCliente, numero, agencia, saldo);
    }

    /**
     * Metodo para fingir carregamento e mostrar a frase de criação de conta.
     *
     * @param nomeCliente
     * @param numeroConta
     * @param agencia
     * @param saldo
     * @throws InterruptedException
     */
    public static void showLoadingAnimation(String nomeCliente, Integer numeroConta, String agencia, double saldo) throws InterruptedException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("##,##0.00", symbols);

        System.out.print("Processando informações");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000); // Aguarda 1 segundo
            System.out.print(".");
        }

        System.out.println("\nOlá "+ nomeCliente  + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo de R$ "+ df.format(saldo) +" já está disponível para saque.");
    }

}
