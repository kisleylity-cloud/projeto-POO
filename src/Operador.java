
public class Operador extends Pessoa implements Permissao {

    public Operador(String nome, String CPF, String dataNascimento, String login, String senha) {
        super(nome, CPF, dataNascimento, login, senha);
    }

    @Override
    public boolean acessarSistema(String login, String senha) {
        return getLogin().equals(login) && verificarSenha(senha);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Operador tem acesso limitado às operações do sistema.");
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Operador: " + getNome() +
                " | CPF: " + getCPF() +
                " | Data de Nascimento: " + getDataNascimento());
    }
}
