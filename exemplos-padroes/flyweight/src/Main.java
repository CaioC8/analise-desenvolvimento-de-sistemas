import java.util.HashMap;
import java.util.Map;

record TipoArvore(String nome, String cor, String textura) {
    void desenhar(int x, int y) {
        System.out.printf("%s %s (%s) em [%d, %d]%n", nome, cor, textura, x, y);
    }
}

class TipoArvoreFactory {
    private static final Map<String, TipoArvore> CACHE = new HashMap<>();

    static TipoArvore obter(String nome, String cor, String textura) {
        String chave = nome + "|" + cor + "|" + textura;
        return CACHE.computeIfAbsent(chave,
                ignorada -> new TipoArvore(nome, cor, textura));
    }

    static int quantidadeDeTipos() {
        return CACHE.size();
    }
}

record Arvore(int x, int y, TipoArvore tipo) {
    void desenhar() {
        tipo.desenhar(x, y);
    }
}

public class Main {
    public static void main(String[] args) {
        TipoArvore pinheiro = TipoArvoreFactory.obter("Pinheiro", "verde", "agulhas.png");

        Arvore primeira = new Arvore(10, 20, pinheiro);
        Arvore segunda = new Arvore(50, 80,
                TipoArvoreFactory.obter("Pinheiro", "verde", "agulhas.png"));

        primeira.desenhar();
        segunda.desenhar();
        System.out.println("Tipos compartilhados: " + TipoArvoreFactory.quantidadeDeTipos());
        System.out.println("Mesmo flyweight? " + (primeira.tipo() == segunda.tipo()));
    }
}
