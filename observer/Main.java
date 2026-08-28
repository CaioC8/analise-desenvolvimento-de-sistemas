public class Main {
  public static void main(String[] args) {
    // Instancia o sujeito
    MonitoramentoMemoria memoria = new MonitoramentoMemoria();

    // Assinantes
    UsuarioComum user1 = new UsuarioComum("caio");
    UsuarioComum user2 = new UsuarioComum("caio2");
    UsuarioAdmin user3 = new UsuarioAdmin("caio3");

    // Assina o sujeito
    memoria.assina(user1);
    memoria.assina(user2);
    memoria.assina(user3);

    // Alguma alteração ocorre na propriedade de interesse
    memoria.setUsoDeMemoria(81);
  }
}
