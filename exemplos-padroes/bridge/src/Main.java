interface CanalEnvio {
    void enviar(String destinatario, String mensagem);
}

class Email implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("E-mail para " + destinatario + ": " + mensagem);
    }
}

class Sms implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("SMS para " + destinatario + ": " + mensagem);
    }
}

abstract class Notificacao {
    protected final CanalEnvio canal;

    Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    abstract void notificar(String destinatario);
}

class NotificacaoPedido extends Notificacao {
    private final int numeroPedido;

    NotificacaoPedido(CanalEnvio canal, int numeroPedido) {
        super(canal);
        this.numeroPedido = numeroPedido;
    }

    @Override
    void notificar(String destinatario) {
        canal.enviar(destinatario, "Pedido " + numeroPedido + " foi enviado");
    }
}

public class Main {
    public static void main(String[] args) {
        Notificacao porEmail = new NotificacaoPedido(new Email(), 123);
        Notificacao porSms = new NotificacaoPedido(new Sms(), 456);

        porEmail.notificar("ana@exemplo.com");
        porSms.notificar("34999999999");
    }
}
