package pratica.builder;

public interface Builder<T> {
  Builder<T> processador(String processador);

  Builder<T> placaVideo(String placaVideo);

  Builder<T> tela(String tela);

  Builder<T> memoriaRamGb(int memoriaRamGb);

  Builder<T> armazenamentoGb(int armazenamento);

  Builder<T> tipoArmazenamento(String tipoAramazenamento);

  T build();
}
