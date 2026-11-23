interface EstadoSemaforo {
    void proximo(Semaforo semaforo);
    String getCor();
}

class Vermelho implements EstadoSemaforo {
    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new Verde());
    }

    @Override
    public String getCor() {
        return "vermelho";
    }
}

class Verde implements EstadoSemaforo {
    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new Amarelo());
    }

    @Override
    public String getCor() {
        return "verde";
    }
}

class Amarelo implements EstadoSemaforo {
    @Override
    public void proximo(Semaforo semaforo) {
        semaforo.setEstado(new Vermelho());
    }

    @Override
    public String getCor() {
        return "amarelo";
    }
}

class Semaforo {
    private EstadoSemaforo estado = new Vermelho();

    void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    void mudar() {
        estado.proximo(this);
    }

    void mostrar() {
        System.out.println("Semáforo: " + estado.getCor());
    }
}

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        for (int i = 0; i < 4; i++) {
            semaforo.mostrar();
            semaforo.mudar();
        }
    }
}
