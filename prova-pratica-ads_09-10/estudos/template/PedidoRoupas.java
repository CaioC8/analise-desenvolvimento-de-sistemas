public class PedidoRoupas extends ProcessaPedido {
  @Override
  protected void validarPedido() {
    System.out.println("Validando tamanho e estoque da roupa.");
  }

  @Override
  protected void processarPagamento() {
    System.out.println("Processando pagamento da roupa.");
  }

  @Override
  protected void entregarPedido() {
    System.out.println("Enviando pedido de roupas.");
  }
}
