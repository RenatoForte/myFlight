import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class GerenciadorAeronaves {
    Map<String, Aeronave> dicionarioNaves = new HashMap<>();

    public void addNave(String codigo, String descricao, String capacidade) {
        dicionarioNaves.put(codigo, new Aeronave(codigo, descricao, capacidade));
    }

    public Aeronave getNave(String codigo) {
        return dicionarioNaves.get(codigo);

    }

    public void removeNave(String codigo) {
        dicionarioNaves.remove(codigo);
    }

    public Map<String, Aeronave> ordenaNome() {
        Map<String, Aeronave> dicionarioOrdenado = new TreeMap<>(dicionarioNaves);
        return dicionarioOrdenado;
    }
}
