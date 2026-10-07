public class Main {
  public static void main(String[] args) {
    VirtualMachine personalizada =
        new VirtualMachine.Builder()
            .comSistemaOperacional("Windows")
            .comMemoriaRam(32)
            .comArmazenamento(1_024)
            .comCpu("Intel Core i9")
            .comGpu("NVIDIA RTX 4080")
            .comSsd(true)
            .build();

    Diretor diretor = new Diretor();
    VirtualMachine desenvolvimento = diretor.criarMaquinaDeDesenvolvimento();
    VirtualMachine machineLearning = diretor.criarMaquinaDeMachineLearning();

    System.out.println(personalizada);
    System.out.println(desenvolvimento);
    System.out.println(machineLearning);
  }
}
