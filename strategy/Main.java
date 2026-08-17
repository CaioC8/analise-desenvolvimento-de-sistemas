public class Main {
  public static void main(String[] args) {
    Carrinho carrinho = new Carrinho();

    double preco = 100;

    // Essa parte precisa ser validada
    // uma vez que é obrigatória antes de aplicar o desconto
    carrinho.defineDesconto(new DescontoPascoa());

    System.out.println(carrinho.getPrecoFinal(preco));
  }
}
