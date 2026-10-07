package pratica.composite;

public class Main {
  public static void main(String[] args) {
    Diretorio documentos = new Pasta("Documentos");
    Diretorio imagens = new Pasta("Imagens");
    Diretorio projetos = new Pasta("Projetos");
    Diretorio areaTrabalho = new Pasta("Área de Trabalho");

    projetos.add(new Arquivo("Main.java", 10));
    documentos.add(new Arquivo("documento.pdf", 20000));
    documentos.add(projetos);
    imagens.add(new Arquivo("foto1.jpg", 50000));
    imagens.add(new Arquivo("foto2.jpg", 67000));
    areaTrabalho.add(documentos);
    areaTrabalho.add(imagens);

    int tamanhoTotal = areaTrabalho.calcularTamanho();

    System.out.println("Tamanho total da Área de Trabalho: " + tamanhoTotal);

    areaTrabalho.exibirEstrutura("");
  }
}
