public class ConfiguracaoSingleton {
  private static ConfiguracaoSingleton configuracao;

  public String nomeAplicacao;
  public String ambiente;
  public String urlBanco;
  public int porta;

  private ConfiguracaoSingleton() {
    nomeAplicacao = "Aplicacao";
    ambiente = "Java";
    urlBanco = "meu_banco";
    porta = 8000;
  }

  public static ConfiguracaoSingleton getConfiguracaoSingleton() {
    if (configuracao == null) {
      configuracao = new ConfiguracaoSingleton();
    }

    return configuracao;
  }
}
