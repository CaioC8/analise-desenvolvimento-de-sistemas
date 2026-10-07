// Director
// Contém as receitas para construir os products efetivamente, sabendo quais as formas de fazer o
// product
public class Diretor {
  public VirtualMachine criarMaquinaDeDesenvolvimento() {
    return new VirtualMachine.Builder()
        .comSistemaOperacional("Linux")
        .comMemoriaRam(16)
        .comArmazenamento(512)
        .comCpu("Intel Core i7")
        .comSsd(true)
        .build();
  }

  public VirtualMachine criarMaquinaDeMachineLearning() {
    return new VirtualMachine.Builder()
        .comSistemaOperacional("Linux")
        .comMemoriaRam(64)
        .comArmazenamento(2_048)
        .comCpu("AMD Ryzen 9")
        .comGpu("NVIDIA RTX 4090")
        .comSsd(true)
        .build();
  }
}
