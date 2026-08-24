import { Pedido } from "./pedido.ts";

export interface Transportadora {
  enviarPedido(pedido: Pedido): void;
}
