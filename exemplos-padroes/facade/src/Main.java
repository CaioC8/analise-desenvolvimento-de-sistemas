class Estoque {
    boolean temProduto(String produto) {
        System.out.println("Estoque verificado para: " + produto);
        return true;
    }
}

class PagamentoService {
    boolean cobrar(double valor) {
        System.out.printf("Pagamento de R$ %.2f aprovado%n", valor);
        return true;
    }
}

class EntregaService {
    void agendar(String produto) {
        System.out.println("Entrega agendada para: " + produto);
    }
}

class LojaFacade {
    private final Estoque estoque = new Estoque();
    private final PagamentoService pagamento = new PagamentoService();
    private final EntregaService entrega = new EntregaService();

    boolean comprar(String produto, double valor) {
        if (!estoque.temProduto(produto)) {
            return false;
        }
        if (!pagamento.cobrar(valor)) {
            return false;
        }
        entrega.agendar(produto);
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        LojaFacade loja = new LojaFacade();
        boolean sucesso = loja.comprar("Fone de ouvido", 199.90);
        System.out.println("Compra concluída? " + sucesso);
    }
}
