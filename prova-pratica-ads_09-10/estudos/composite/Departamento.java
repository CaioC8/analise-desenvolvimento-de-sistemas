import java.util.ArrayList;
import java.util.List;

// Composite
// É o componente que guarda uma lista de outros componentes, com eles podendo ser um outro
// composite ou um leaf
// Herda a estrutura do Component
public class Departamento extends ComponenteOrganizacional {
  private final List<ComponenteOrganizacional> componentes = new ArrayList<>();

  public Departamento(String nome) {
    super(nome);
  }

  public void adicionar(ComponenteOrganizacional componente) {
    componentes.add(componente);
  }

  public void remover(ComponenteOrganizacional componente) {
    componentes.remove(componente);
  }

  @Override
  public double calcularCustoSalarial() {
    double total = 0;

    for (ComponenteOrganizacional componente : componentes) {
      total += componente.calcularCustoSalarial();
    }

    return total;
  }

  @Override
  public void exibirEstrutura(String indentacao) {
    System.out.println(indentacao + "Departamento: " + getNome());

    for (ComponenteOrganizacional componente : componentes) {
      componente.exibirEstrutura(indentacao + "  ");
    }
  }
}
