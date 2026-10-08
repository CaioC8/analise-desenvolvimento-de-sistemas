package pratica.builder;

public class DiretorNotebook {
  public static Notebook criarNotebookGamer() {
    return new Notebook.NotebookBuilder()
        .processador("Ryzen 7 9800X3D")
        .tela("Tela 32' OLED")
        .placaVideo("RTX 5090")
        .memoriaRamGb(64)
        .armazenamentoGb(2000)
        .tipoArmazenamento("SSD Nvme.m2")
        .build();
  }

  public static Notebook criarNotebookCorporativo() {
    return new Notebook.NotebookBuilder()
        .processador("Intel Core i9-14900K")
        .tela("Tela 27' IPS")
        .memoriaRamGb(128)
        .armazenamentoGb(4000)
        .tipoArmazenamento("SSD Sata")
        .build();
  }
}
