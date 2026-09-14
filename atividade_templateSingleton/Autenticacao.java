import java.util.List;

public abstract class Autenticacao {
  protected List<Usuario> usuarios;

  public Autenticacao(List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }

  public final SessaoUsuario login(String email, String senha, String codigo2F) {
    if (!validarCredenciais(email, senha)) {
      System.out.println("Usuário ou senha incorretos.");
      return null;
    }

    if (!autenticarDoisFatores(codigo2F)) {
      System.out.println("Falha na autenticação de dois fatores. Tente novamente.");
      return null;
    }

    System.out.println("Login efetuado com sucesso.");
    return SessaoUsuario.getSessaoUsuario();
  }

  public abstract boolean validarCredenciais(String email, String senha);

  public abstract boolean autenticarDoisFatores(String codigo2F);
}
