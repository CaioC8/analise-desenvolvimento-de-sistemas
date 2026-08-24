import type { CalculadorFrete } from "./calculador-frete.ts";

// Concrete Strategy: implementa o cálculo do frete normal.
export class CalculadorFreteNormal implements CalculadorFrete {
  public calcularFrete(distancia: number): number {
    return distancia * 0.5;
  }
}
