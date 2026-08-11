public class SistemaPagamento {
  private ConfiguracaoSingleton configuracao;

  public SistemaPagamento(ConfiguracaoSingleton configuracao) {
    this.configuracao = configuracao;
  }

  public ConfiguracaoSingleton getConfiguracao() {
    return this.configuracao;
  }
}
