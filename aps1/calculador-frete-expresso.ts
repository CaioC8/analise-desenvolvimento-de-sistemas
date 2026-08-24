import type { CalculadorFrete } from "./calculador-frete.ts";

export class CalculadorFreteExpresso implements CalculadorFrete {
  public calcularFrete(distancia: number): number {
    return distancia * 1.2;
  }
}
