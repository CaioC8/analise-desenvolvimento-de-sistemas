package pratica.template;

public class AutenticacaoEmailSenha extends Autenticacao {
  @Override
  protected void criarSessao() {
    System.out.println();
    System.out.println("Criando sessão utilizando somente e-mail e senha...");
    System.out.println("Sessão criada com sucesso.");
  }

  @Override
  protected void registrarAcesso() {
    System.out.println();
    System.out.println("Registrando acesso utilizando somente e-mail e senha...");
    System.out.println(
        "Acesso registrado com sucesso. Usuário autenticou usando somente e-mail e senha.");
  }
}
