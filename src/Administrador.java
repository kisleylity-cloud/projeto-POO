
public class Administrador extends Pessoa implements Permissao {

    public Administrador(String nome, String CPF, String dataNascimento, String login, String senha) {
        super(nome, CPF, dataNascimento, login, senha);
    }

    @Override
    public boolean acessarSistema(String login, String senha) {
        return getLogin().equals(login) && verificarSenha(senha);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Administrador pode gerenciar usuários, relatórios e configurações do sistema.");
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Administrador: " + getNome() +
                " | CPF: " + getCPF() +
                " | Data de Nascimento: " + getDataNascimento());
    }
}
