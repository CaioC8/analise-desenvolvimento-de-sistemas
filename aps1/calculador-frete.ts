// Strategy: define um contrato comum para os diferentes
// algoritmos de cálculo de frete.
export interface CalculadorFrete {
  calcularFrete(distancia: number): number;
}
