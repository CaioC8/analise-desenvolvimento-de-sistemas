import java.util.*;

// Objeto composto
public class Pasta extends FileSystemComponent {
  // A composição/agregação (Tem um)
  private List<FileSystemComponent> arquivos = new ArrayList<>();

  public Pasta(String nomeArquivo) {
    super(nomeArquivo);
  }

  @Override
  public void add(FileSystemComponent arquivo) {
    this.arquivos.add(arquivo);
  }

  @Override
  public void remove(FileSystemComponent arquivo) {
    this.arquivos.remove(arquivo);
  }

  @Override
  public FileSystemComponent buscarFilho(int i) {
    return this.arquivos.get(i);
  }

  @Override
  public void display(String indent) {
    System.out.println(indent + "Pasta: " + this.getNomeArquivo());

    for (FileSystemComponent arquivo : this.arquivos) {
      arquivo.display(indent + "" + indent);
    }
  }

  @Override
  public double getTamanhoArquivo() {
    double size = 0;

    for (FileSystemComponent arquivo : this.arquivos) {
      size += arquivo.getTamanhoArquivo();
    }

    return size;
  }
}
