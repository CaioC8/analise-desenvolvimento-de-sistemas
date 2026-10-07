package pratica.template;

public class AutenticacaoDoisFatores extends Autenticacao {
  @Override
  protected void criarSessao() {
    System.out.println();
    System.out.println("Criando sessão utilizando a autenticação de dois fatores...");
    System.out.println(
        "Sessão criada com sucesso. Sessão criada com autenticação de dois fatores.");
  }

  @Override
  protected void registrarAcesso() {
    System.out.println();
    System.out.println("Registrando acesso utilizando a autenticação de dois fatores...");
    System.out.println("Acesso registrado com sucesso. Usuário autenticou usando dois fatores.");
  }

  @Override
  protected void validarSegundoFator(String codigo) {
    System.out.println();
    System.out.println("Validando código de segundo fator...");

    if (codigo == null || codigo.isBlank()) {
      throw new IllegalArgumentException("Código não fornecido.");
    }

    System.out.println("Código '" + codigo + "' validado com sucesso.");
  }
}
