public class AssinaturaDecorator extends DocumentoDecorator {
  public AssinaturaDecorator(IDocumento documento) {
    super(documento);
  }

  @Override
  public String exportar() {
    return "[ASSINATURA]\n" + super.exportar();
  }
}
