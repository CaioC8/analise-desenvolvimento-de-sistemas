final class Configuracao {
    private Configuracao() {
    }

    private static class Holder {
        private static final Configuracao INSTANCIA = new Configuracao();
    }

    public static Configuracao getInstancia() {
        return Holder.INSTANCIA;
    }

    public String getNomeAplicacao() {
        return "Loja Exemplo";
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao primeira = Configuracao.getInstancia();
        Configuracao segunda = Configuracao.getInstancia();

        System.out.println(primeira.getNomeAplicacao());
        System.out.println("Mesma instância? " + (primeira == segunda));
    }
}
