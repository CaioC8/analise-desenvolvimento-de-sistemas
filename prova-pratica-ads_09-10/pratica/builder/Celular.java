package pratica.builder;

public final class Celular {
  private final String processador;
  private final String placaVideo;
  private final String tela;
  private final Integer memoriaRamGb;
  private final Integer armazenamentoGb;
  private final String tipoArmazenamento;

  private Celular(CelularBuilder builder) {
    this.processador = builder.processador;
    this.placaVideo = builder.placaVideo;
    this.armazenamentoGb = builder.armazenamentoGb;
    this.memoriaRamGb = builder.memoriaRamGb;
    this.tela = builder.tela;
    this.tipoArmazenamento = builder.tipoArmazenamento;
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

  public static class CelularBuilder implements Builder<Celular> {
    private String processador;
    private String placaVideo = "Sem placa de vídeo dedicada";
    private String tela;
    private Integer memoriaRamGb;
    private Integer armazenamentoGb;
    private String tipoArmazenamento;

    @Override
    public CelularBuilder armazenamentoGb(int armazenamentoGb) {
      this.armazenamentoGb = armazenamentoGb;
      return this;
    }

    @Override
    public CelularBuilder memoriaRamGb(int memoriaRamGb) {
      this.memoriaRamGb = memoriaRamGb;
      return this;
    }

    @Override
    public CelularBuilder placaVideo(String placaVideo) {
      this.placaVideo = placaVideo;
      return this;
    }

    @Override
    public CelularBuilder processador(String processador) {
      this.processador = processador;
      return this;
    }

    @Override
    public CelularBuilder tela(String tela) {
      this.tela = tela;
      return this;
    }

    @Override
    public CelularBuilder tipoArmazenamento(String tipoAramazenamento) {
      this.tipoArmazenamento = tipoAramazenamento;
      return this;
    }

    @Override
    public Celular build() {
      if (this.memoriaRamGb <= 0
          || this.armazenamentoGb <= 0
          || this.memoriaRamGb == null
          || this.armazenamentoGb == null) {
        throw new IllegalStateException(
            "A memória RAM e o armazenamento devem ser valores positivos.");
      }

      if (this.processador == null || this.processador.equals("")) {
        throw new IllegalStateException("O processador deve ser informado.");
      }

      if (this.tela == null || this.tela.equals("")) {
        throw new IllegalStateException("A tela deve ser informado.");
      }

      return new Celular(this);
    }
  }
}
