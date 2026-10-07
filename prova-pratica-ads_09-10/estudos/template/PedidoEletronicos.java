public class PedidoEletronicos extends ProcessaPedido {
  @Override
  protected void validarPedido() {
    System.out.println("Validando estoque e restrições do eletrônico.");
  }

  @Override
  protected void processarPagamento() {
    System.out.println("Processando pagamento do eletrônico.");
  }

  @Override
  protected void aposPagamento() {
    System.out.println("Registrando seguro opcional do eletrônico.");
  }

  @Override
  protected void entregarPedido() {
    System.out.println("Enviando eletrônico com embalagem reforçada.");
  }
}
