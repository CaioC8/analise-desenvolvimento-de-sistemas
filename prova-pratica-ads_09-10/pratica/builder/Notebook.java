package pratica.builder;

public final class Notebook {
  private final String processador;
  private final String placaVideo;
  private final String tela;
  private final Integer memoriaRamGb;
  private final Integer armazenamentoGb;
  private final String tipoArmazenamento;

  Notebook(NotebookBuilder builder) {
    this.processador = builder.getProcessador();
    this.armazenamentoGb = builder.getArmazenamentoGb();
    this.memoriaRamGb = builder.getMemoriaRam();
    this.placaVideo = builder.getPlacaVideo();
    this.tela = builder.getTela();
    this.tipoArmazenamento = builder.getTipoArmazenamento();
  }

  @Override
  public String toString() {
    return "Processador: "
        + this.processador
        + "; Placa de vídeo: "
        + this.placaVideo
        + "; Tela: "
        + this.tela
        + "; Memória RAM: "
        + this.memoriaRamGb
        + "; Armazenamento (GB): "
        + this.armazenamentoGb
        + "; Tipo do armazenamento: "
        + this.tipoArmazenamento;
  }
}
