import java.util.ArrayList;
import java.util.List;

interface ItemPedido {
    double getPreco();
    void exibir(String indentacao);
}

class Produto implements ItemPedido {
    private final String nome;
    private final double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.printf("%s- %s: R$ %.2f%n", indentacao, nome, preco);
    }
}

class Caixa implements ItemPedido {
    private final String nome;
    private final List<ItemPedido> itens = new ArrayList<>();

    Caixa(String nome) {
        this.nome = nome;
    }

    void adicionar(ItemPedido item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        return itens.stream().mapToDouble(ItemPedido::getPreco).sum();
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "+ " + nome);
        itens.forEach(item -> item.exibir(indentacao + "  "));
    }
}

public class Main {
    public static void main(String[] args) {
        Caixa pedido = new Caixa("Pedido");
        pedido.adicionar(new Produto("Livro", 50.00));

        Caixa presente = new Caixa("Caixa de presente");
        presente.adicionar(new Produto("Caneca", 25.00));
        presente.adicionar(new Produto("Chocolate", 15.00));
        pedido.adicionar(presente);

        pedido.exibir("");
        System.out.printf("Total: R$ %.2f%n", pedido.getPreco());
    }
}
