interface Transporte {
    void entregar(String pacote);
}

class Caminhao implements Transporte {
    @Override
    public void entregar(String pacote) {
        System.out.println("Entregando por estrada: " + pacote);
    }
}

class Navio implements Transporte {
    @Override
    public void entregar(String pacote) {
        System.out.println("Entregando por mar: " + pacote);
    }
}

abstract class Logistica {
    public void planejarEntrega(String pacote) {
        Transporte transporte = criarTransporte();
        transporte.entregar(pacote);
    }

    protected abstract Transporte criarTransporte();
}

class LogisticaRodoviaria extends Logistica {
    @Override
    protected Transporte criarTransporte() {
        return new Caminhao();
    }
}

class LogisticaMaritima extends Logistica {
    @Override
    protected Transporte criarTransporte() {
        return new Navio();
    }
}

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new LogisticaRodoviaria();
        logistica.planejarEntrega("Livros");

        logistica = new LogisticaMaritima();
        logistica.planejarEntrega("Máquinas");
    }
}
