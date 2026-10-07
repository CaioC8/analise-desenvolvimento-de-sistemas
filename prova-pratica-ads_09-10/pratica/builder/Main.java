package pratica.builder;

public class Main {
  public static void main(String[] args) {
    Notebook notebook =
        new NotebookBuilder()
            .processador("Ryzen 7 5700x")
            .tela("Tela 24' OLED")
            .memoriaRamGb(32)
            .armazenamentoGb(1000)
            .tipoArmazenamento("SSD")
            .build();

    Celular celular =
        new CelularBuilder()
            .processador("Snapdragon")
            .tela("Tela 6' LCS")
            .memoriaRamGb(12)
            .armazenamentoGb(256)
            .tipoArmazenamento("SSD")
            .build();

    System.out.println(notebook.toString());
    System.out.println();
    System.out.println(celular.toString());
    System.out.println();

    Notebook notebookGamer = DiretorNotebook.criarNotebookGamer();
    Notebook notebookCorporativo = DiretorNotebook.criarNotebookCorporativo();

    System.out.println(notebookGamer);
    System.out.println();
    System.out.println(notebookCorporativo);
  }
}
