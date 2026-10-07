package pratica.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
// Armazena lista de components, que podem ser arquivos ou outras pastas
// Implementa as operações do component, permitindo percorrer recursivamente a estrutura de arquivos
public class Pasta extends Diretorio {
  private final List<Diretorio> diretorios = new ArrayList<>();

  public Pasta(String nome) {
    super(nome);
  }

  public void add(Diretorio diretorio) {
    this.diretorios.add(diretorio);
  }

  public void remove(Diretorio diretorio) {
    this.diretorios.remove(diretorio);
  }

  @Override
  public int calcularTamanho() {
    int total = 0;

    for (Diretorio diretorio : diretorios) {
      total += diretorio.calcularTamanho();
    }

    return total;
  }

  @Override
  public void exibirEstrutura(String identacao) {
    System.out.println(identacao + "Pasta: " + this.getNome());

    for (Diretorio diretorio : diretorios) {
      diretorio.exibirEstrutura(identacao + "  ");
    }
  }
}
