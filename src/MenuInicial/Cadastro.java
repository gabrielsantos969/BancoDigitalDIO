package MenuInicial;

public class Cadastro {

    private String primeiroNome;
    private String sobrenome;
    private String email;
    private String senha;
    private String cpf;

    public Cadastro() {
        super();
    }

    public Cadastro(String primeiroNome, String sobrenome, String email, String senha, String cpf) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String nomeCompleto(){
        return primeiroNome + " " + sobrenome;
    }

    public static Cadastro cadastroCliente(String primeiroNome, String sobrenome, String email, String senha, String cpf){
        return new Cadastro(primeiroNome, sobrenome, email, senha, cpf);
    }
}
