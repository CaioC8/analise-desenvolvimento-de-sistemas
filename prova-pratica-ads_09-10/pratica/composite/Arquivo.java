package pratica.composite;

// Leaf
// Representa um objeto sem filhos component
// Executa diretamente as operações e encerra a recursividade
public class Arquivo extends Diretorio {
  private final int tamanhoKb;

  public Arquivo(String nome, int tamanhoKb) {
    super(nome);
    this.tamanhoKb = tamanhoKb;
  }

  @Override
  public void add(Diretorio diretorio) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void remove(Diretorio diretorio) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int calcularTamanho() {
    return this.tamanhoKb;
  }

  @Override
  public void exibirEstrutura(String identacao) {
    System.out.println(
        identacao + "Arquivo: " + this.getNome() + "; Tamanho (Kb): " + this.tamanhoKb);
  }
}
