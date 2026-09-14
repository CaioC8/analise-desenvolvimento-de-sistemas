import java.util.List;

public class AutenticacaoSistema extends Autenticacao {
  public AutenticacaoSistema(List<Usuario> usuarios) {
    super(usuarios);
  }

  @Override
  public boolean validarCredenciais(String email, String senha) {
    for (Usuario usuario : super.usuarios) {
      if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public boolean autenticarDoisFatores(String codigo2F) {
    for (Usuario usuario : super.usuarios) {
      if (usuario.getCodigo2F().equals(codigo2F)) {
        return true;
      }
    }

    return false;
  }
}
