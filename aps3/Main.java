public class Main {
  public static void main(String[] args) {
    IDocumento documento = new Relatorio2("Relatório");

    documento = new MarcaDaguaDecorator(documento);
    documento = new CompactacaoDecorator(documento);
    documento = new CriptografiaDecorator(documento);
    documento = new AssinaturaDecorator(documento);

    System.out.println(documento.exportar());
  }
}

    // Relatorio relatorio =
    //     new Relatorio.Builder("Relatório mensal", "Caio", LocalDate.now(), "Conteúdo do
    // relatório.")
    //         .resumo("Resumo opcional")
    //         .prioridade(0)
    //         .departamento("Departamento opcional")
    //         .rodape("Rodapé opcional")
    //         .build();

    // System.out.println(relatorio.toString());
