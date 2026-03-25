
public class Main {
    public static void main(String[] args) {

        Administrador admin = new Administrador(
                "Carlos Silva",
                "123.456.789-00",
                "01/01/1990",
                "admin",
                "1234"
        );

        Operador operador = new Operador(
                "João Souza",
                "987.654.321-00",
                "02/02/2000",
                "operador",
                "abcd"
        );

        System.out.println("=== DADOS DOS USUÁRIOS ===");
        admin.exibirPessoa();
        operador.exibirPessoa();

        System.out.println("\n=== TESTE DE LOGIN ADMINISTRADOR ===");
        SistemaAutenticacao.autenticar(admin, "admin", "1234");

        System.out.println("\n=== TESTE DE LOGIN OPERADOR ===");
        SistemaAutenticacao.autenticar(operador, "operador", "abcd");

        System.out.println("\n=== TESTE DE LOGIN INCORRETO ===");
        SistemaAutenticacao.autenticar(operador, "operador", "9999");
    }
}
