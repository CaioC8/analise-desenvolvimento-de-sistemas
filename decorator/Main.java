public class Main {
  public static void main(String[] args) {
    NotificaApp notificadorApp = new NotificaApp();
    notificadorApp.enviar("notificador padrao");

    // Não é possivel usar decorator na classe NotificaApp, ela não consegue receber algo do tipo
    // NotificaDecorator
    // notificadorApp = new EmailDecorator(notificadorApp);

    // notificadorApp.enviar("mensagem email");

    INotifica notificador = new NotificaApp();

    notificador.enviar("notificador certo");

    notificador = new SmsDecorator(notificador);

    notificador.enviar("mensagem sms");

    notificador = new EmailDecorator(notificador);

    notificador.enviar("mensagem email");
  }
}
