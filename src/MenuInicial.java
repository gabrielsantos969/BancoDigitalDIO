import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MenuInicial {

    private Map<Integer, String> opcoes;
    private Scanner scanner;
    double saldo = 0;

    public MenuInicial() {
        opcoes = new HashMap<>();
        opcoes.put(1, "Login");
        opcoes.put(2, "Cadastrar");
        opcoes.put(3, "Sair");
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        for (Map.Entry<Integer, String> entry : opcoes.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void executar() throws InterruptedException {
        int opcao = 0;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Login");
                    // Adicione aqui o código para o login
                    break;
                case 2:
                    System.out.println("Você escolheu Cadastrar");

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
                    break;
                case 3:
                    System.out.print("Saindo");
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(1000); // Aguarda 1 segundo
                        System.out.print(".");
                    }
                    System.out.print("\n\nObrigado por utilizar nosso sistema, volte sempre!!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
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
