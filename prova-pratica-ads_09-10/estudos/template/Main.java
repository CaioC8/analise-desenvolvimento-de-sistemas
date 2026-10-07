public class Main {
    public static void main(String[] args) {
        ProcessaPedido pedidoRoupas = new PedidoRoupas();
        ProcessaPedido pedidoEletronicos = new PedidoEletronicos();

        pedidoRoupas.processarPedido();

        System.out.println();

        pedidoEletronicos.processarPedido();
    }
}
