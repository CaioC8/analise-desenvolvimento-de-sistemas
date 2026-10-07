// Leaf
// É uma classe que não guarda a instância de outros componentes
// Herda a estrutura do Component
public class Funcionario extends ComponenteOrganizacional {
  private final double salario;

  public Funcionario(String nome, double salario) {
    super(nome);
    this.salario = salario;
  }

  @Override
  public double calcularCustoSalarial() {
    return salario;
  }

  @Override
  public void exibirEstrutura(String indentacao) {
    System.out.printf("%sFuncionario: %s - R$ %.2f%n", indentacao, getNome(), salario);
  }
}
