public class Relatorio2 implements IDocumento {
  private String conteudo;

  public Relatorio2(String conteudo) {
    this.conteudo = conteudo;
  }

  @Override
  public String exportar() {
    return conteudo;
  }
}
