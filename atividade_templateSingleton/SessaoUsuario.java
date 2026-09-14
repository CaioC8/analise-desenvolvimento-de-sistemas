public class SessaoUsuario {
  private static SessaoUsuario sessaoUsuario;

  private SessaoUsuario() {}

  public static SessaoUsuario getSessaoUsuario() {
    if (sessaoUsuario == null) {
      sessaoUsuario = new SessaoUsuario();
    }

    return sessaoUsuario;
  }
}
