package pratica.template;

public abstract class Autenticacao {
  public final void autenticar(String email, String senha, String codigo) {
    this.validarCredenciais(email, senha);
    this.validarSegundoFator(codigo);
    this.criarSessao();
    this.registrarAcesso();
    System.out.println("Autenticado com sucesso.");
  }

  protected void validarCredenciais(String email, String senha) {
    System.out.println("Validando credenciais...");

    if (email == null || senha == null || email.isBlank() || senha.isBlank()) {
      throw new IllegalArgumentException("E-mail ou senha não fornecidos.");
    }

    System.out.println("E-mail '" + email + "' e senha '" + senha + "' validados com sucesso.");
  }

  protected void validarSegundoFator(String codigo) {}

  protected abstract void criarSessao();

  protected abstract void registrarAcesso();
}
