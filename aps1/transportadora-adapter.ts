import type { CalculadorFrete } from "./calculador-frete.ts";
import type { Transportadora } from "./transportadora.ts";
import { TransportadoraExterna } from "./transportadora-externa.ts";
import { Pedido } from "./pedido.ts";

// Adapter: adapta a interface da TransportadoraExterna
// para a interface Transportadora utilizada pelo sistema.
export class TransportadoraAdapter implements Transportadora {
  private transportadoraExterna: TransportadoraExterna;
  private calculadorFrete: CalculadorFrete;

  constructor(
    transportadoraExterna: TransportadoraExterna,
    calculadorFrete: CalculadorFrete,
  ) {
    this.transportadoraExterna = transportadoraExterna;
    this.calculadorFrete = calculadorFrete;
  }

  enviarPedido(pedido: Pedido): void {
    const distanciaEnvio = this.transportadoraExterna.enviarParaDestinatario(
      pedido.getAssinatura(),
      pedido.getCliente().getEndereco(),
      pedido.getCliente().getNome(),
    );

    // Mapea os valores de cada um dos itens do pedido, multiplicando a quantidade pelo valor unitário
    // Retorna uma lista com os valores: [10, 20, 30]
    const valores = pedido
      .getItens()
      .map((item) => item.quantidade * item.valorUnitario);

    // Soma todos os valores calculados anteriormente.
    // O reduce recebe uma função com o acumulador (total) e o valor atual da iteração (atual).
    // O segundo parâmetro, 0, é o valor inicial do acumulador.
    const valorTotal = valores.reduce((total, atual) => total + atual, 0);

    const valorFrete = this.calculadorFrete.calcularFrete(distanciaEnvio);

    console.log(
      `Pedido enviado com sucesso. Valor do pedido: R$ ${valorTotal}; Frete de R$ ${valorFrete}`,
    );
  }
}
