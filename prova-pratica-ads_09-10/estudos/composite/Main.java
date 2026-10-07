// Client
// Vai utilizar
public class Main {
  public static void main(String[] args) {
    Departamento acme = new Departamento("Acme Corporation");
    Departamento tecnologia = new Departamento("Tecnologia");
    Departamento desenvolvimento = new Departamento("Desenvolvimento");
    Departamento recursosHumanos = new Departamento("Recursos Humanos");

    desenvolvimento.adicionar(new Funcionario("Ana", 8_500));
    desenvolvimento.adicionar(new Funcionario("Bruno", 7_200));
    tecnologia.adicionar(desenvolvimento);
    tecnologia.adicionar(new Funcionario("Carlos", 6_000));
    recursosHumanos.adicionar(new Funcionario("Diana", 5_500));

    acme.adicionar(tecnologia);
    acme.adicionar(recursosHumanos);

    acme.exibirEstrutura("");
    System.out.printf("Custo salarial total: R$ %.2f%n", acme.calcularCustoSalarial());
  }
}
