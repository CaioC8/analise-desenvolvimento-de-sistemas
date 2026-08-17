public class DescontoAnoNovo implements IDesconto {
  // Implementar o método abstrato do Strategy (interface)
  @Override
  public double aplicarDesconto(double preco) {
    // 15% de desconto
    return preco * 0.85;
  }
}
