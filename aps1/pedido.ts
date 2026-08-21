import { Cliente } from "./cliente.ts";
import { TipoFrete } from "./tipo-frete.ts";

export class Pedido {
  private assinatura: string;
  private cliente: Cliente;
  private itens: {
    produto: string;
    quantidade: number;
    valorUnitario: number;
  }[];
  private tipoFrete: TipoFrete;

  constructor(
    assinatura: string,
    cliente: Cliente,
    itens: { produto: string; quantidade: number; valorUnitario: number }[],
    tipoFrete: TipoFrete,
  ) {
    this.assinatura = assinatura;
    this.cliente = cliente;
    this.itens = itens;
    this.tipoFrete = tipoFrete;
  }

  getAssinatura(): string {
    return this.assinatura;
  }

  getCliente(): Cliente {
    return this.cliente;
  }

  getItens(): { produto: string; quantidade: number; valorUnitario: number }[] {
    return this.itens;
  }

  getTipoFrete(): TipoFrete {
    return this.tipoFrete;
  }

  toString(): string {
    return `Assinatura: ${this.assinatura} - Cliente ${this.cliente.toString()} - Itens: ${this.itens} - Tipo do frete: ${this.tipoFrete}`;
  }
}
