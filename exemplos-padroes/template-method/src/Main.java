abstract class Relatorio {
    public final void gerar() {
        buscarDados();
        formatarCabecalho();
        formatarCorpo();
        if (deveAdicionarRodape()) {
            adicionarRodape();
        }
    }

    protected void buscarDados() {
        System.out.println("Buscando dados...");
    }

    protected abstract void formatarCabecalho();
    protected abstract void formatarCorpo();

    protected boolean deveAdicionarRodape() {
        return true;
    }

    protected void adicionarRodape() {
        System.out.println("Rodapé padrão");
    }
}

class RelatorioHtml extends Relatorio {
    @Override
    protected void formatarCabecalho() {
        System.out.println("<h1>Vendas</h1>");
    }

    @Override
    protected void formatarCorpo() {
        System.out.println("<p>Total: R$ 1.000,00</p>");
    }
}

class RelatorioTexto extends Relatorio {
    @Override
    protected void formatarCabecalho() {
        System.out.println("=== VENDAS ===");
    }

    @Override
    protected void formatarCorpo() {
        System.out.println("Total: R$ 1.000,00");
    }

    @Override
    protected boolean deveAdicionarRodape() {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Relatorio html = new RelatorioHtml();
        html.gerar();

        System.out.println();
        Relatorio texto = new RelatorioTexto();
        texto.gerar();
    }
}
