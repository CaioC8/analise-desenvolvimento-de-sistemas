public class MarcaDaguaDecorator extends DocumentoDecorator {
  public MarcaDaguaDecorator(IDocumento documento) {
    super(documento);
  }

  @Override
  public String exportar() {
    return "[MARCA D'ÁGUA]\n" + super.exportar();
  }
}
