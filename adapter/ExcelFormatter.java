public class ExcelFormatter {
    public void formataColunas() {
        System.out.println("Col A | " + "Col B | " + "Col C");
    }

    public void formataLinhas() {
        System.out.println("Formatando linhas...");
        System.out.println("Removendo registros nulos...");
    }

    public void formataEstilo() {
        System.out.println("Formatando estilo...");
        System.out.println("Fonte: Times New Roman");
        System.out.println("Tamanho da fonte: 12");
    }

    public void executa() {
        this.formataColunas();
        this.formataLinhas();
        this.formataEstilo();
    }
}