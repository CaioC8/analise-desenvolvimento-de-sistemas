public abstract class ProcessaPedido {
  // Template Method: fixa o algoritmo e a ordem das etapas.
  public final void processarPedido() {
    validarPedido();
    processarPagamento();
    aposPagamento();
    entregarPedido();
    enviarNotificacao();
  }

  // Etapas obrigatórias: cada subclasse precisa implementá-las.
  protected abstract void validarPedido();

  protected abstract void processarPagamento();

  protected abstract void entregarPedido();

  // Hook opcional: a subclasse pode sobrescrevê-lo.
  protected void aposPagamento() {}

  // Etapa concreta compartilhada por todas as subclasses.
  protected final void enviarNotificacao() {
    System.out.println("Notificação enviada ao cliente.");
  }
}
