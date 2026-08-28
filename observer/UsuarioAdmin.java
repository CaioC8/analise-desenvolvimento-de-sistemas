// ConcreteObserver
public class UsuarioAdmin implements ServerObserver {
  private String userName;

  public UsuarioAdmin(String nome) {
    this.userName = nome;
  }

  @Override
  public void update(double usoDeMemoria) {
    if (usoDeMemoria > 80) {
      System.out.println(
          "Notificando o usuário " + this.userName + " uso de memória ultrapassou 80%.");
    }
  }
}
