public class SistemaRelatorios {
  private ConfiguracaoSingleton configuracao;

  public SistemaRelatorios(ConfiguracaoSingleton configuracao) {
    this.configuracao = configuracao;
  }

  public ConfiguracaoSingleton getConfiguracao() {
    return this.configuracao;
  }
}
