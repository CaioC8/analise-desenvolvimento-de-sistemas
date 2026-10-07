// Product
// Representa o objeto que será construído
public final class VirtualMachine {
  private final String sistemaOperacional;
  private final int memoriaRamGb;
  private final int armazenamentoGb;
  private final String cpu;
  private final String gpu;
  private final boolean ssd;

  private VirtualMachine(Builder builder) {
    this.sistemaOperacional = builder.sistemaOperacional;
    this.memoriaRamGb = builder.memoriaRamGb;
    this.armazenamentoGb = builder.armazenamentoGb;
    this.cpu = builder.cpu;
    this.gpu = builder.gpu;
    this.ssd = builder.ssd;
  }

  @Override
  public String toString() {
    return "VirtualMachine{"
        + "sistemaOperacional='"
        + sistemaOperacional
        + '\''
        + ", memoriaRamGb="
        + memoriaRamGb
        + ", armazenamentoGb="
        + armazenamentoGb
        + ", cpu='"
        + cpu
        + '\''
        + ", gpu='"
        + gpu
        + '\''
        + ", ssd="
        + ssd
        + '}';
  }

  // Builder e Concrete Builder
  // Defina as etapas para a construção do product
  // Aramazena os valores e efetivamente produz o objeto
  // Nesse caso, a classe Builder exerce os papéis de Builder e Concrete Builder, ja que não temos
  // diferentes tipos de builder
  public static class Builder {
    private String sistemaOperacional;
    private int memoriaRamGb;
    private int armazenamentoGb;
    private String cpu;
    private String gpu = "Sem GPU dedicada";
    private boolean ssd;

    public Builder comSistemaOperacional(String sistemaOperacional) {
      this.sistemaOperacional = sistemaOperacional;
      return this;
    }

    public Builder comMemoriaRam(int memoriaRamGb) {
      this.memoriaRamGb = memoriaRamGb;
      return this;
    }

    public Builder comArmazenamento(int armazenamentoGb) {
      this.armazenamentoGb = armazenamentoGb;
      return this;
    }

    public Builder comCpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Builder comGpu(String gpu) {
      this.gpu = gpu;
      return this;
    }

    public Builder comSsd(boolean ssd) {
      this.ssd = ssd;
      return this;
    }

    public VirtualMachine build() {
      if (sistemaOperacional == null || sistemaOperacional.isBlank()) {
        throw new IllegalStateException("O sistema operacional é obrigatório");
      }
      if (cpu == null || cpu.isBlank()) {
        throw new IllegalStateException("A CPU é obrigatória");
      }
      if (memoriaRamGb <= 0 || armazenamentoGb <= 0) {
        throw new IllegalStateException("RAM e armazenamento devem ser positivos");
      }

      return new VirtualMachine(this);
    }
  }
}
