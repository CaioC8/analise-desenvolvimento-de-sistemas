public abstract class NotificaDecorator implements INotifica {
  INotifica notificador;

  public NotificaDecorator(INotifica notificador) {
    this.notificador = notificador;
  }

  @Override
  public void enviar(String mensagem) {
    this.notificador.enviar(mensagem);
  }
}
