public class EmailDecorator extends NotificaDecorator {
  public EmailDecorator(INotifica notificador) {
    super(notificador);
  }

  public void preparaMensagemEmail() {
    System.out.println("Preparando mensagem e-mail...");
    System.out.println("Enviando mensagem e-mail...");
    System.out.println("Mensagem e-mail enviada com sucesso.");
  }

  @Override
  public void enviar(String mensagem) {
    super.enviar(mensagem); // Também envia mensagem via aplicação
    this.preparaMensagemEmail(); // Prepara a mensagem antes de enviar
    System.out.println("Enviando mensagem via e-mail: " + mensagem);
  }
}
