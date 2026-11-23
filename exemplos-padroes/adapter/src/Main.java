interface Pagamento {
    void pagar(double valor);
}

class GatewayAntigo {
    void realizarCobrancaEmCentavos(long centavos) {
        System.out.println("Gateway antigo cobrou " + centavos + " centavos");
    }
}

class GatewayAdapter implements Pagamento {
    private final GatewayAntigo gateway;

    GatewayAdapter(GatewayAntigo gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pagar(double valor) {
        long centavos = Math.round(valor * 100);
        gateway.realizarCobrancaEmCentavos(centavos);
    }
}

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new GatewayAdapter(new GatewayAntigo());
        pagamento.pagar(49.90);
    }
}
