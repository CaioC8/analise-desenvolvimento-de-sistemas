// Component
// estabelece as operações e os atributos comuns
public abstract class ComponenteOrganizacional {
  private final String nome;

  protected ComponenteOrganizacional(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public abstract double calcularCustoSalarial();

  public abstract void exibirEstrutura(String indentacao);
}
