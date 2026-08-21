import { Cliente } from "./cliente.ts";
import { Pedido } from "./pedido.ts";
import { Transportadora } from "./transportadora.ts";
import { TransportadoraExterna } from "./transportadora-externa.ts";
import { TipoFrete } from "./tipo-frete.ts";
import { CalculadorFreteNormal } from "./calculador-frete-normal.ts";
import { TransportadoraAdapter } from "./transportadora-adapter.ts";
import { ConfiguracaoSingleton } from "./configuracao-singleton.ts";

const configuracao = ConfiguracaoSingleton.getConfiguracaoSingleton();

console.log(
  `${configuracao.nomeAplicacao} - ${configuracao.ambiente} - ${configuracao.porta}`,
);
console.log("\n");

const cliente: Cliente = new Cliente("Caio", "rua alguma coisa, 12");

const itens: { produto: string; quantidade: number; valorUnitario: number }[] =
  [
    { produto: "Mouse", quantidade: 3, valorUnitario: 100 },
    { produto: "Teclado", quantidade: 1, valorUnitario: 200 },
  ];

const pedido: Pedido = new Pedido(
  "caio-cesar",
  cliente,
  itens,
  TipoFrete.NORMAL,
);

console.log(cliente.toString());
console.log("\n");
console.log(pedido.toString());
console.log("\n");

const transportadora: Transportadora = new TransportadoraAdapter(
  new TransportadoraExterna(),
  new CalculadorFreteNormal(),
);

transportadora.enviarPedido(pedido);
