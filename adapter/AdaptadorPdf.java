public class AdaptadorPdf implements IFormatadorAdapter{
    // Associação com código legado
    private ExcelFormatter formatadorPlanilhas;

    public AdaptadorPdf(ExcelFormatter formatadorPlanilhas) {
        this.formatadorPlanilhas = formatadorPlanilhas;
    }

    @Override
    public void execucaoAdaptada() {
        System.out.println("Lendo o PDF");
        System.out.println("Buscar planilhas no PDF");
        System.out.println("if len(planilha) < 1: então return null");
        System.out.println("else: retorna a planilha");

        // Delega restante da execução para o código legado
        this.formatadorPlanilhas.executa();
    }
}