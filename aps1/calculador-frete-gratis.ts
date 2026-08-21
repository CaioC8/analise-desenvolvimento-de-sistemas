import { CalculadorFrete } from "./calculador-frete.ts";

export class CalculadorFreteGratis implements CalculadorFrete {
  public calcularFrete(distancia: number): number {
    return distancia * 0;
  }
}
