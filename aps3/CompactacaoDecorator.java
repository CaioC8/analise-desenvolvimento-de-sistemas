public class CompactacaoDecorator extends DocumentoDecorator {
  public CompactacaoDecorator(IDocumento documento) {
    super(documento);
  }

  @Override
  public String exportar() {
    return "[COMPACTACAO]\n" + super.exportar();
  }
}
