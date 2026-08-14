// Client
public class Main {
    public static void main(String[] args) {
        AdaptadorPdf adaptadorPdf = new AdaptadorPdf(new ExcelFormatter());

        adaptadorPdf.execucaoAdaptada();
    }
}