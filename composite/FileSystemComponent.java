// Componente
// Tipo em comum entre os objetos compostos e folha
public abstract class FileSystemComponent {
  private String nomeArquivo;
  private double tamanhoArquivo;

  public FileSystemComponent(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  public void add(FileSystemComponent arquivo) {
    throw new UnsupportedOperationException();
  }

  public void remove(FileSystemComponent arquivo) {
    throw new UnsupportedOperationException();
  }

  public FileSystemComponent buscarFilho(int i) {
    throw new UnsupportedOperationException();
  }

  public abstract void display(String indent);

  public String getNomeArquivo() {
    return this.nomeArquivo;
  }

  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  public double getTamanhoArquivo() {
    return this.tamanhoArquivo;
  }

  public void setTamanhoArquivo(double tamanhoArquivo) {
    this.tamanhoArquivo = tamanhoArquivo;
  }
}
