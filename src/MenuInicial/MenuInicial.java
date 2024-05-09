package MenuInicial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class MenuInicial {

    private final Map<Integer, String> opcoes;
    private final Scanner scanner;

    Cadastro cadastro = new Cadastro();

    public MenuInicial() {
        opcoes = new HashMap<>();
        opcoes.put(1, "Login");
        opcoes.put(2, "Cadastrar");
        opcoes.put(3, "Sair");
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\nMenu:");
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
                    System.out.println("Informe seus dados para se cadastrar no Banco Digital DIO:");

                    System.out.print("\nMe informe seu primeiro nome: ");
                    String primeiroNome = scanner.next();
                    scanner.nextLine();

                    System.out.print("Me informe seu sobrenome: ");
                    String sobrenome = scanner.next();
                    scanner.nextLine();

                    System.out.print("Me informe seu email: ");
                    String email = scanner.next();
                    scanner.nextLine();

                    System.out.print("Digite a senha que deseja colocar: ");
                    String senha = scanner.next();
                    scanner.nextLine();

                    System.out.print("Me informe o seu CPF: ");
                    String cpf = scanner.next();
                    scanner.nextLine();

                    cadastro = Cadastro.cadastroCliente(primeiroNome, sobrenome, email, senha, cpf);

                    showLoadingAnimation("Processando informações");
                    System.out.print("\nSeja bem vindo: " + cadastro.nomeCompleto() + " Sua conta foi criada com sucesso." );
                    break;
                case 3:
                    showLoadingAnimation("Saindo");
                    System.out.print("\n\nObrigado por utilizar nosso sistema, volte sempre!!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
    }

    /**
     * Metodo para fingir carregamento.
     */
    public static void showLoadingAnimation(String nomeCarregamento) throws InterruptedException {

        System.out.print(nomeCarregamento);

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000); // Aguarda 1 segundo
            System.out.print(".");
        }
    }


}
