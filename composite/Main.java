public class Main {
  public static void main(String[] args) {
    // Objetos compostos
    FileSystemComponent pasta1 = new Pasta("Pasta 1");
    FileSystemComponent pasta2 = new Pasta("Pasta 2");

    FileSystemComponent arquivo1 = new Arquivo("Main.java", 1);
    FileSystemComponent arquivo2 = new Arquivo("FileSystemComponent.java", 2);

    pasta1.add(arquivo1);
    pasta2.add(arquivo2);
    pasta1.add(pasta2);

    pasta1.display("    ");
    // pasta2.display("");

    System.out.println(pasta1.getTamanhoArquivo());
  }
}
