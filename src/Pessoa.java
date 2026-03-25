public abstract class Pessoa {
    private String nome;
    private String CPF;
    private String dataNascimento;
    private String login;
    private String senha;

    public Pessoa(String nome, String CPF, String dataNascimento, String login, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public boolean verificarSenha(String senhaInformada) {
        return senha.equals(senhaInformada);
    }

    public abstract void exibirPessoa();
}
