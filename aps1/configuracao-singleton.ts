// Singleton: garante que exista apenas uma instância
// das configurações durante a execução da aplicação.
export class ConfiguracaoSingleton {
  private static configuracao: ConfiguracaoSingleton | null = null;

  public nomeAplicacao: string | null;
  public ambiente: string | null;
  public porta: number | null;

  private constructor() {
    this.nomeAplicacao = "Sistema de Processamento de Pedidos";
    this.ambiente = "Node";
    this.porta = 3000;
  }

  public static getInstancia(): ConfiguracaoSingleton {
    if (this.configuracao === null) {
      this.configuracao = new ConfiguracaoSingleton();
    }

    return this.configuracao;
  }
}
