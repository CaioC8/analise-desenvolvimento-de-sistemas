import java.util.ArrayList;
import java.util.List;

interface Prototype<T> {
    T copiar();
}

class Documento implements Prototype<Documento> {
    private String titulo;
    private final List<String> paragrafos;

    Documento(String titulo, List<String> paragrafos) {
        this.titulo = titulo;
        this.paragrafos = new ArrayList<>(paragrafos);
    }

    private Documento(Documento original) {
        this(original.titulo, original.paragrafos);
    }

    @Override
    public Documento copiar() {
        return new Documento(this);
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    void adicionarParagrafo(String texto) {
        paragrafos.add(texto);
    }

    @Override
    public String toString() {
        return titulo + " -> " + paragrafos;
    }
}

public class Main {
    public static void main(String[] args) {
        Documento original = new Documento("Relatório", List.of("Introdução"));
        Documento copia = original.copiar();

        copia.setTitulo("Cópia do relatório");
        copia.adicionarParagrafo("Conclusão");

        System.out.println("Original: " + original);
        System.out.println("Cópia:    " + copia);
    }
}
