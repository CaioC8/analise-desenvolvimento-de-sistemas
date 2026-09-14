import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    List<Usuario> usuarios = new ArrayList<>();

    usuarios.add(new Usuario("caio@email.com", "senha123", "codigo123"));
    usuarios.add(new Usuario("caio2@email.com", "senha1234", "codigo1234"));
    usuarios.add(new Usuario("caio2@email.com", "senha1235", "codigo1235"));
    usuarios.add(new Usuario("caio2@email.com", "senha1236", "codigo1236"));

    Autenticacao autenticacao = new AutenticacaoSistema(usuarios);

    System.out.print("E-mail: ");
    String email = scan.nextLine();

    System.out.println();
    System.out.print("Senha: ");
    String senha = scan.nextLine();

    System.out.println();
    System.out.print("Código para autenticação de duplo fator: ");
    String codigo2F = scan.nextLine();

    System.out.println();

    SessaoUsuario sessao = autenticacao.login(email, senha, codigo2F);

    if (sessao == null) {
      sessao = null;
    }

    scan.close();
  }
}
