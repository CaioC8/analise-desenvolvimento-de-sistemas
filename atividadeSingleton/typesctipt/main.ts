// Os atributos são declrados da seguinte forma:
// public statit atributo: Tipo | OutroTipo | null = "valor padrão";

// As variáveis são declradas da seguinte forma:
// const variavel: Tipo = "valor";

// Os parâmetros e o retorno de um método/funcão são tipados da seguinte forma:
// metodo(parametro: Tipo, parametro2: Tipo2): RetornoMetodo {}

class ConfiguracaoSingleton {
  private static configuracao: ConfiguracaoSingleton | null = null;

  public nomeAplicacao: string | null;
  public ambiente: string | null;
  public urlBanco: string | null;
  public porta: number | null;

  private constructor() {
    this.nomeAplicacao = "Aplicacao";
    this.ambiente = "Node";
    this.urlBanco = "meu_banco";
    this.porta = 3000;
  }

  public static getConfiguracaoSingleton(): ConfiguracaoSingleton {
    // O operador === verifica se o valor e o tipo são iguais, então:
    // Se configuracao for estritamente igual (valor e tipo) a null
    if (this.configuracao === null) {
      this.configuracao = new ConfiguracaoSingleton();
    }

    return this.configuracao;
  }
}

class SistemaPagamento {
  private configuracao: ConfiguracaoSingleton;

  public constructor(configuracao: ConfiguracaoSingleton) {
    this.configuracao = configuracao;
  }

  public getConfiguracao(): ConfiguracaoSingleton {
    return this.configuracao;
  }
}

class SistemaRelatorios {
  private configuracao: ConfiguracaoSingleton;

  public constructor(configuracao: ConfiguracaoSingleton) {
    this.configuracao = configuracao;
  }

  public getConfiguracao(): ConfiguracaoSingleton {
    return this.configuracao;
  }
}

const config1: ConfiguracaoSingleton =
  ConfiguracaoSingleton.getConfiguracaoSingleton();
const config2: ConfiguracaoSingleton =
  ConfiguracaoSingleton.getConfiguracaoSingleton();

const pagamento: SistemaPagamento = new SistemaPagamento(config1);
const relatorios: SistemaRelatorios = new SistemaRelatorios(config2);

if (config1 === config2) {
  console.log("Configurações iguais.");
}

if (pagamento.getConfiguracao() === relatorios.getConfiguracao()) {
  console.log("Configurações dos sistemas iguais.");
}

console.log(pagamento.getConfiguracao().nomeAplicacao); // Aplicacao
console.log(relatorios.getConfiguracao().nomeAplicacao); // Aplicacao

relatorios.getConfiguracao().nomeAplicacao = "Outra Aplicacao";

console.log(pagamento.getConfiguracao().nomeAplicacao); // Outra Aplicacao
console.log(relatorios.getConfiguracao().nomeAplicacao); // Outra Aplicacao
