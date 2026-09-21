public abstract class DocumentoDecorator implements IDocumento {

  protected IDocumento documento;

  public DocumentoDecorator(IDocumento documento) {
    this.documento = documento;
  }

  @Override
  public String exportar() {
    return documento.exportar();
  }
}
