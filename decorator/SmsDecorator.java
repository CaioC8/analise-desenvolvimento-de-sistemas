public class SmsDecorator extends NotificaDecorator {
  public SmsDecorator(INotifica notificador) {
    super(notificador);
  }

  public void preparaMensagemSms() {
    System.out.println("Preparando mensagem SMS...");
    System.out.println("Enviando mensagem SMS...");
    System.out.println("Mensagem SMS enviada com sucesso.");
  }

  @Override
  public void enviar(String mensagem) {
    super.enviar(mensagem); // Também envia mensagem via aplicação
    this.preparaMensagemSms(); // Prepara a mensagem antes de enviar
    System.out.println("Enviando mensagem via SMS: " + mensagem);
  }
}
