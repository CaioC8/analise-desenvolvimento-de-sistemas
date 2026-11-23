interface Cafe {
    String getDescricao();
    double getPreco();
}

class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 4.00;
    }
}

abstract class CafeDecorator implements Cafe {
    protected final Cafe cafe;

    CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}

class ComLeite extends CafeDecorator {
    ComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + leite";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.00;
    }
}

class ComChocolate extends CafeDecorator {
    ComChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + chocolate";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 3.00;
    }
}

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        cafe = new ComLeite(cafe);
        cafe = new ComChocolate(cafe);

        System.out.printf("%s: R$ %.2f%n", cafe.getDescricao(), cafe.getPreco());
    }
}
