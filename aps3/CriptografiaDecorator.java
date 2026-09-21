public class CriptografiaDecorator extends DocumentoDecorator {
  public CriptografiaDecorator(IDocumento documento) {
    super(documento);
  }

  @Override
  public String exportar() {
    return "[CRIPTOGRAFIA]\n" + super.exportar();
  }
}
