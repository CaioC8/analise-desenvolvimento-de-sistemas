// A tipagem é colocada após o nome da variável ou atributo.
// Exemplos:
// private nome: string;
// public porta: number;
// const cliente: Cliente = new Cliente(...);

// Também é possível definir múltiplos tipos utilizando "|":
// let valor: string | null = null;

// Métodos e funções informam o tipo dos parâmetros
// e o tipo do retorno:
// metodo(parametro: Tipo): Retorno {}

// "import type" é utilizado quando a importação serve apenas para tipagem.
// Interfaces do TypeScript são utilizadas em tempo de desenvolvimento
// e não existem no JavaScript gerado.
import type { Transportadora } from "./transportadora.ts";
import { Cliente } from "./cliente.ts";
import { Pedido } from "./pedido.ts";
import { TransportadoraExterna } from "./transportadora-externa.ts";
import { CalculadorFreteNormal } from "./calculador-frete-normal.ts";
import { TransportadoraAdapter } from "./transportadora-adapter.ts";
import { ConfiguracaoSingleton } from "./configuracao-singleton.ts";

const configuracao = ConfiguracaoSingleton.getInstancia();

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

const pedido: Pedido = new Pedido("caio-cesar", cliente, itens);

console.log(cliente.toString());
console.log("\n");
console.log(pedido.toString());
console.log("\n");

// Aqui é escolhida a estratégia de cálculo de frete.
// Poderia existir uma função responsável por selecionar automaticamente a estratégia adequada.
const calculadorFrete = new CalculadorFreteNormal();

const transportadora: Transportadora = new TransportadoraAdapter(
  new TransportadoraExterna(),
  calculadorFrete,
);

transportadora.enviarPedido(pedido);
