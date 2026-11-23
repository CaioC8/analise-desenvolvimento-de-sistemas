# Exemplos de Padrões de Projeto GoF em Java

Coleção didática de exemplos pequenos e independentes dos padrões de projeto pedidos. Cada pasta contém:

- `src/Main.java`: exemplo completo e executável;
- `README.md`: intenção, características, recursos de POO, vantagens, desvantagens e diagrama de classes.

## Padrões

| Categoria       | Padrões                                                                                                                                                                                                              |
| --------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Criacionais     | [Builder](builder/README.md), [Factory Method](factory-method/README.md), [Prototype](prototype/README.md), [Singleton](singleton/README.md)                                                                         |
| Estruturais     | [Adapter](adapter/README.md), [Bridge](bridge/README.md), [Composite](composite/README.md), [Decorator](decorator/README.md), [Facade](facade/README.md), [Flyweight](flyweight/README.md), [Proxy](proxy/README.md) |
| Comportamentais | [Chain of Responsibility](chain-of-responsibility/README.md), [Observer](observer/README.md), [State](state/README.md), [Strategy](strategy/README.md), [Template Method](template-method/README.md)                 |

## Requisitos

- JDK 17 ou superior.

Os exemplos também são compatíveis com JDK 21.

## Como executar

Entre na pasta de um padrão. Exemplo com Builder:

```bash
cd builder
javac -d out src/Main.java
java -cp out Main
```

No PowerShell, os mesmos comandos funcionam sem alterações. A pasta `out` é apenas saída de compilação e pode ser apagada quando desejar.

## Organização didática

Para manter cada exemplo fácil de copiar e testar, as classes auxiliares têm visibilidade de pacote e ficam no mesmo arquivo de `Main`. Em um projeto real, normalmente cada classe seria colocada em seu próprio arquivo e pacote.

Os diagramas usam [Mermaid](https://mermaid.js.org/). Mesmo em um visualizador que não renderize Mermaid, as relações continuam explícitas no bloco de texto.
