package pratica.template;

public class Main {
  public static void main(String[] args) {
    Autenticacao autenticacaoEmailSenha = new AutenticacaoEmailSenha();
    Autenticacao autenticacaoDoisFatores = new AutenticacaoDoisFatores();

    autenticacaoEmailSenha.autenticar("caio@email.com", "senha123@", null);

    System.out.println();
    System.out.println();

    autenticacaoDoisFatores.autenticar("caio2@email.com", "senha456@", "codigo123");
  }
}
