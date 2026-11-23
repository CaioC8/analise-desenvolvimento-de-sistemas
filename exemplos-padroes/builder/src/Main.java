class Pedido {
    private final String cliente;
    private final String produto;
    private final int quantidade;
    private final boolean entregaExpressa;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.produto = builder.produto;
        this.quantidade = builder.quantidade;
        this.entregaExpressa = builder.entregaExpressa;
    }

    static class Builder {
        private final String cliente;
        private final String produto;
        private int quantidade = 1;
        private boolean entregaExpressa;

        Builder(String cliente, String produto) {
            this.cliente = cliente;
            this.produto = produto;
        }

        Builder quantidade(int quantidade) {
            if (quantidade <= 0) {
                throw new IllegalArgumentException("A quantidade deve ser positiva");
            }
            this.quantidade = quantidade;
            return this;
        }

        Builder entregaExpressa(boolean entregaExpressa) {
            this.entregaExpressa = entregaExpressa;
            return this;
        }

        Pedido build() {
            return new Pedido(this);
        }
    }

    @Override
    public String toString() {
        return "Pedido{cliente='%s', produto='%s', quantidade=%d, expressa=%s}"
                .formatted(cliente, produto, quantidade, entregaExpressa);
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido.Builder("Ana", "Notebook")
                .quantidade(2)
                .entregaExpressa(true)
                .build();

        System.out.println(pedido);
    }
}
