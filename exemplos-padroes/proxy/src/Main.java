import java.util.HashMap;
import java.util.Map;

interface BancoDeDados {
    String consultar(String sql);
}

class BancoDeDadosReal implements BancoDeDados {
    @Override
    public String consultar(String sql) {
        System.out.println("Executando consulta no banco: " + sql);
        return "resultado de [" + sql + "]";
    }
}

class BancoDeDadosComCache implements BancoDeDados {
    private BancoDeDadosReal bancoReal;
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String consultar(String sql) {
        if (cache.containsKey(sql)) {
            System.out.println("Retornando resultado do cache");
            return cache.get(sql);
        }

        if (bancoReal == null) {
            bancoReal = new BancoDeDadosReal();
        }
        String resultado = bancoReal.consultar(sql);
        cache.put(sql, resultado);
        return resultado;
    }
}

public class Main {
    public static void main(String[] args) {
        BancoDeDados banco = new BancoDeDadosComCache();
        String consulta = "SELECT nome FROM clientes";

        System.out.println(banco.consultar(consulta));
        System.out.println(banco.consultar(consulta));
    }
}
