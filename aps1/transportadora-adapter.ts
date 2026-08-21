import { TransportadoraExterna } from "./transportadora-externa.ts";
import type { CalculadorFrete } from "./calculador-frete.ts";
import type { Transportadora } from "./transportadora.ts";
import { Pedido } from "./pedido.ts";

export class TransportadoraAdapter implements Transportadora {
  constructor(
    private transportadoraExterna: TransportadoraExterna,
    private calculadorFrete: CalculadorFrete,
  ) {}

  enviarPedido(pedido: Pedido): void {
    const distanciaEnvio = this.transportadoraExterna.enviarParaDestinatario(
      pedido.getAssinatura(),
      pedido.getCliente().getEndereco(),
      pedido.getCliente().getNome(),
    );

    const valores = pedido
      .getItens()
      .map((item) => item.quantidade * item.valorUnitario);

    const valorTotal = valores.reduce((total, atual) => total + atual, 0);

    const valorFrete = this.calculadorFrete.calcularFrete(distanciaEnvio);

    console.log(
      `Pedido enviado com sucesso. Valor do pedido: R$ ${valorTotal}; Frete de R$ ${valorFrete}`,
    );
  }
}
