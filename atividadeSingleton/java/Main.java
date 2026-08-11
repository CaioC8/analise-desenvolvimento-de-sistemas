public class Main {
  public static void main(String[] args) {
    ConfiguracaoSingleton config1 = ConfiguracaoSingleton.getConfiguracaoSingleton();
    ConfiguracaoSingleton config2 = ConfiguracaoSingleton.getConfiguracaoSingleton();

    SistemaPagamento pagamento = new SistemaPagamento(config1);
    SistemaRelatorios relatorios = new SistemaRelatorios(config2);

    if (config1 == config2) {
      System.out.println("Configurações iguais.");
    }

    if (pagamento.getConfiguracao() == relatorios.getConfiguracao()) {
      System.out.println("Configurações dos sistemas iguais.");
    }

    System.out.println(pagamento.getConfiguracao().nomeAplicacao); // Aplicacao
    System.out.println(relatorios.getConfiguracao().nomeAplicacao); // Aplicacao

    relatorios.getConfiguracao().nomeAplicacao = "Outra Aplicacao";

    System.out.println(pagamento.getConfiguracao().nomeAplicacao); // Outra Aplicacao
    System.out.println(relatorios.getConfiguracao().nomeAplicacao); // Outra Aplicacao
  }
}
