package pratica.composite;

// Component
// Define a estrutura padrão para leafs (Arquivo) e composites (Pasta)
public abstract class Diretorio {
  private final String nome;

  protected Diretorio(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public abstract void add(Diretorio diretorio);

  public abstract void remove(Diretorio diretorio);

  public abstract int calcularTamanho();

  public abstract void exibirEstrutura(String identacao);
}
