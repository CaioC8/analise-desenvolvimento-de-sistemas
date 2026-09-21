import java.time.LocalDate;

public class Relatorio {
  private final String titulo;
  private final String autor;
  private final LocalDate data;
  private final String conteudo;
  private final String resumo;
  private final Integer prioridade;
  private final String rodape;
  private final String departamento;

  private Relatorio(Builder builder) {
    this.titulo = builder.titulo;
    this.autor = builder.autor;
    this.data = builder.data;
    this.conteudo = builder.conteudo;

    this.resumo = builder.resumo;
    this.prioridade = builder.prioridade;
    this.rodape = builder.rodape;
    this.departamento = builder.departamento;
  }

  @Override
  public String toString() {
    return "Título: "
        + this.titulo
        + "; Autor: "
        + this.autor
        + "; Data: "
        + this.data
        + "; Conteúdo: "
        + this.conteudo
        + "; Resumo: "
        + this.resumo
        + "; Prioridade: "
        + this.prioridade
        + "; Rodapé: "
        + this.rodape
        + "; Departamento: "
        + this.departamento;
  }

  public static class Builder {
    // Atributos Obrigatórios
    private final String titulo;
    private final String autor;
    private final LocalDate data;
    private final String conteudo;

    // Atributos Opcionais
    private String resumo;
    private Integer prioridade;
    private String rodape;
    private String departamento;

    public Builder(String titulo, String autor, LocalDate data, String conteudo) {
      this.titulo = titulo;
      this.autor = autor;
      this.data = data;
      this.conteudo = conteudo;
    }

    public Builder resumo(String resumo) {
      this.resumo = resumo;
      return this;
    }

    public Builder prioridade(int prioridade) {
      this.prioridade = prioridade;
      return this;
    }

    public Builder rodape(String rodape) {
      this.rodape = rodape;
      return this;
    }

    public Builder departamento(String departamento) {
      this.departamento = departamento;
      return this;
    }

    public Relatorio build() {
      return new Relatorio(this);
    }
  }
}
