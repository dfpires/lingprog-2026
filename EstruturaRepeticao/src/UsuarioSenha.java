import java.util.Scanner;

public class UsuarioSenha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        // Utilizamos o while para repetir enquanto a condição de erro for verdadeira
        // A condição é: usuário igual à senha

        System.out.println("--- CADASTRO DE USUÁRIO ---");

        System.out.print("Digite o nome de usuário: ");
        usuario = entrada.next();

        System.out.print("Digite a senha: ");
        senha = entrada.next();

        // .equals() é o método correto para comparar Strings em Java
        while (usuario.equalsIgnoreCase(senha)) {
            System.out.println("\n[ERRO]: A senha não pode ser igual ao nome de usuário!");
            System.out.println("Por favor, tente novamente.");

            System.out.print("\nDigite o nome de usuário: ");
            usuario = entrada.next();

            System.out.print("Digite a senha: ");
            senha = entrada.next();
        }

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Bem-vindo, " + usuario + "!");
    }
}
