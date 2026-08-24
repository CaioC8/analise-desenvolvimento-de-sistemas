import { Cliente } from "./cliente.ts";

export class Pedido {
  private assinatura: string;
  private cliente: Cliente;

  // O tipo desta variável foi definido diretamente como um objeto literal,
  // evitando a criação de uma interface apenas para representar os itens.
  //
  // Trata-se de uma lista de objetos em que cada objeto possui:
  // produto, quantidade e valorUnitario.
  //
  // A estrutura se parece visualmente com JSON,
  // mas aqui são objetos JavaScript/TypeScript.
  private itens: {
    produto: string;
    quantidade: number;
    valorUnitario: number;
  }[];

  constructor(
    assinatura: string,
    cliente: Cliente,
    itens: { produto: string; quantidade: number; valorUnitario: number }[],
  ) {
    this.assinatura = assinatura;
    this.cliente = cliente;
    this.itens = itens;
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

  toString(): string {
    const itens = this.itens
      .map(
        (item) =>
          `${item.produto} (${item.quantidade}x R$ ${item.valorUnitario})`,
      )
      .join(", ");

    return `Assinatura: ${this.assinatura} - Cliente: ${this.cliente.toString()} - Itens: ${itens}`;
  }
}
