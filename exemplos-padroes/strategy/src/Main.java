interface FreteStrategy {
    double calcular(double pesoKg);
}

class FreteNormal implements FreteStrategy {
    @Override
    public double calcular(double pesoKg) {
        return 5.00 + pesoKg * 1.50;
    }
}

class FreteExpresso implements FreteStrategy {
    @Override
    public double calcular(double pesoKg) {
        return 12.00 + pesoKg * 3.00;
    }
}

class CalculadoraFrete {
    private FreteStrategy strategy;

    CalculadoraFrete(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    double calcular(double pesoKg) {
        return strategy.calcular(pesoKg);
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteNormal());
        System.out.printf("Normal: R$ %.2f%n", calculadora.calcular(10));

        calculadora.setStrategy(new FreteExpresso());
        System.out.printf("Expresso: R$ %.2f%n", calculadora.calcular(10));
    }
}
