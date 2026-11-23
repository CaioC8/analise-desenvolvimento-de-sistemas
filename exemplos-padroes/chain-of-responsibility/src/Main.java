abstract class Suporte {
    private Suporte proximo;

    Suporte definirProximo(Suporte proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public final void atender(int nivel, String problema) {
        if (podeAtender(nivel)) {
            resolver(problema);
        } else if (proximo != null) {
            proximo.atender(nivel, problema);
        } else {
            System.out.println("Ninguém pôde resolver: " + problema);
        }
    }

    protected abstract boolean podeAtender(int nivel);
    protected abstract void resolver(String problema);
}

class SuporteBasico extends Suporte {
    @Override
    protected boolean podeAtender(int nivel) {
        return nivel <= 1;
    }

    @Override
    protected void resolver(String problema) {
        System.out.println("Suporte básico resolveu: " + problema);
    }
}

class SuporteTecnico extends Suporte {
    @Override
    protected boolean podeAtender(int nivel) {
        return nivel <= 2;
    }

    @Override
    protected void resolver(String problema) {
        System.out.println("Suporte técnico resolveu: " + problema);
    }
}

class Gerente extends Suporte {
    @Override
    protected boolean podeAtender(int nivel) {
        return nivel <= 3;
    }

    @Override
    protected void resolver(String problema) {
        System.out.println("Gerente resolveu: " + problema);
    }
}

public class Main {
    public static void main(String[] args) {
        Suporte inicio = new SuporteBasico();
        inicio.definirProximo(new SuporteTecnico())
                .definirProximo(new Gerente());

        inicio.atender(1, "Redefinir senha");
        inicio.atender(2, "Aplicativo não abre");
        inicio.atender(3, "Autorizar equipamento novo");
        inicio.atender(4, "Incidente desconhecido");
    }
}
