## Comparação dos três padrões

| Padrão          | Use quando                                                       | Evite quando                                                           | Principais conceitos de POO                       |
| --------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------- | ------------------------------------------------- |
| Composite       | Existir uma hierarquia em árvore                                 | A estrutura for plana ou sem recursividade                             | Abstração, polimorfismo, herança e composição     |
| Builder         | Um objeto tiver muitos parâmetros e configurações                | O objeto for simples e tiver poucos parâmetros                         | Encapsulamento, abstração e composição            |
| Template Method | Classes seguirem o mesmo algoritmo com algumas etapas diferentes | Os algoritmos forem muito diferentes ou precisarem mudar dinamicamente | Herança, polimorfismo, abstração e encapsulamento |

## Composite

### Quando usar

Use quando precisar representar uma hierarquia de objetos em formato de árvore:

- arquivos e pastas;
- departamentos e funcionários;
- menus e submenus;
- produtos e kits;
- componentes gráficos.

É especialmente útil quando o cliente deve tratar um objeto individual e um conjunto de objetos da mesma maneira:

```java
diretorio.calcularTamanho();
```

Essa chamada funciona tanto para um `Arquivo` quanto para uma `Pasta`.

### Quando não usar

Evite quando:

- existe apenas uma coleção simples, sem níveis;
- folhas e objetos compostos possuem operações completamente diferentes;
- não é necessário tratar objetos individuais e grupos uniformemente;
- a estrutura pode criar ciclos difíceis de controlar.

Se você possui apenas uma lista de arquivos, uma `List<Arquivo>` provavelmente já resolve.

### Princípios de POO

**Abstração**

O `Component` define as operações comuns:

```java
public interface Diretorio {
    int calcularTamanho();
}
```

**Polimorfismo**

A mesma chamada produz comportamentos diferentes:

```java
diretorio.calcularTamanho();
```

- `Arquivo` retorna seu tamanho;
- `Pasta` soma os tamanhos dos filhos.

**Herança ou implementação de interface**

```java
Arquivo implements Diretorio
Pasta implements Diretorio
```

**Composição**

A `Pasta` é formada por vários componentes:

```java
private List<Diretorio> diretorios;
```

A ideia principal é:

> Um Composite “é um” Component e “tem vários” Components.

---

## Builder

### Quando usar

Use quando:

- o objeto possui muitos parâmetros;
- vários parâmetros são opcionais;
- o construtor ficaria muito grande;
- existem diferentes configurações do mesmo objeto;
- o objeto precisa ser validado antes da criação;
- você deseja criar um objeto imutável.

Exemplo:

```java
Notebook notebook = new NotebookBuilder()
        .processador("Ryzen 7")
        .memoriaRamGb(32)
        .armazenamentoGb(1000)
        .build();
```

O Builder também é útil quando a criação acontece em várias etapas.

### Quando não usar

Evite quando o objeto é simples:

```java
new Usuario("Caio", "caio@email.com");
```

Para dois ou três parâmetros obrigatórios e claros, criar um Builder adicionaria classes e complexidade desnecessárias.

Também não é a melhor escolha quando o problema é apenas decidir **qual classe instanciar**. Nesse caso, um Factory Method pode ser mais apropriado.

### Princípios de POO

**Encapsulamento**

O Product esconde seu processo de criação:

```java
Notebook(NotebookBuilder builder)
```

O cliente não precisa conhecer os detalhes internos da construção.

**Abstração**

A interface Builder define as etapas disponíveis:

```java
public interface Builder<T> {
    Builder<T> processador(String processador);
    T build();
}
```

**Polimorfismo**

Diferentes builders podem seguir o mesmo contrato:

```java
NotebookBuilder implements Builder<Notebook>
CelularBuilder implements Builder<Celular>
```

**Composição**

O Product é construído a partir do estado acumulado no Builder. O Director também utiliza um Builder para executar uma receita.

A ideia principal é:

> O Builder monta o estado passo a passo e o `build()` entrega o objeto pronto.

---

## Template Method

### Quando usar

Use quando várias classes seguem o mesmo algoritmo geral, na mesma ordem, mas algumas etapas são diferentes.

Exemplo:

```text
validar credenciais
→ validar etapa adicional
→ criar sessão
→ registrar acesso
```

A autenticação simples e a autenticação 2FA seguem esse mesmo fluxo, mas o 2FA possui uma etapa adicional.

Também é útil para:

- remover código duplicado entre subclasses;
- impedir que subclasses alterem a ordem do algoritmo;
- fornecer etapas comuns e hooks opcionais.

### Quando não usar

Evite quando:

- os algoritmos não possuem uma estrutura realmente comum;
- quase todas as etapas são diferentes;
- seriam necessárias muitas subclasses;
- o comportamento precisa ser trocado dinamicamente;
- você não pode usar herança.

Quando é necessário trocar o algoritmo durante a execução, composição com Strategy costuma ser mais flexível.

### Princípios de POO

**Abstração**

A classe abstrata define o esqueleto:

```java
public abstract class Autenticacao
```

Ela determina quais etapas existem sem necessariamente implementar todas.

**Herança**

As classes concretas estendem a classe abstrata:

```java
AutenticacaoDoisFatores extends Autenticacao
```

**Polimorfismo**

O Template Method chama uma etapa:

```java
validarSegundoFator(codigo);
```

A implementação executada depende do objeto concreto.

**Encapsulamento**

O algoritmo fica protegido dentro da superclasse:

```java
public final void autenticar(...)
```

As etapas ficam `protected`, impedindo que o cliente as execute fora da ordem:

```java
protected abstract void criarSessao();
```

A ideia principal é:

> A superclasse determina quando cada etapa será executada; as subclasses determinam como algumas etapas serão executadas.

## Resumo para memorizar

### Composite

> Use para árvores de objetos quando folhas e grupos precisam ser tratados uniformemente.

Conceito dominante: **composição e polimorfismo**.

### Builder

> Use para construir objetos complexos, com muitos parâmetros ou configurações opcionais.

Conceito dominante: **encapsulamento da construção**.

### Template Method

> Use quando diferentes classes seguem o mesmo algoritmo, mas personalizam algumas etapas.

Conceito dominante: **herança e polimorfismo**.
