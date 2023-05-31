import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class GerenciadorAeroporto{
    Map<String, Aeroporto> dicionarioPortos = new HashMap<>();

    public void addPorto(String codigo,String nome,double latitude,double longitude){
        dicionarioPortos.put(codigo, new Aeroporto(codigo, nome, latitude, longitude));
    }

    public void addPorto(String codigo,String nome,String latitude,String longitude){
        dicionarioPortos.put(codigo, new Aeroporto(codigo, nome, Double.parseDouble(latitude), Double.parseDouble(longitude)));
    }

    public Aeroporto getPorto(String codigo) {
        return dicionarioPortos.get(codigo);
    }

    public Geo getGeo(String codigo) {
        return getPorto(codigo).getGeo();
    }

    public Map<String, Aeroporto> ordenaNome() {
        Map<String, Aeroporto> dicionarioOrdenado = new TreeMap<>(dicionarioPortos);
        return dicionarioOrdenado;
    }
}
