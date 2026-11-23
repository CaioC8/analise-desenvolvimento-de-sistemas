import java.util.ArrayList;
import java.util.List;

interface Observer {
    void atualizar(int temperatura);
}

class EstacaoMeteorologica {
    private final List<Observer> observers = new ArrayList<>();
    private int temperatura;

    void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
    }

    private void notificarObservers() {
        observers.forEach(observer -> observer.atualizar(temperatura));
    }
}

class Painel implements Observer {
    private final String nome;

    Painel(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(int temperatura) {
        System.out.printf("%s recebeu: %d °C%n", nome, temperatura);
    }
}

public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        Observer celular = new Painel("Aplicativo");
        Observer site = new Painel("Site");

        estacao.adicionarObserver(celular);
        estacao.adicionarObserver(site);
        estacao.setTemperatura(28);

        estacao.removerObserver(site);
        estacao.setTemperatura(30);
    }
}
