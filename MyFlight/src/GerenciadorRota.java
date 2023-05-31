import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GerenciadorRota {
    ArrayList<Rota> rotas = new ArrayList<>();
    Map<String, ArrayList<Rota>> dicionarioRotas = new HashMap<>();


    public void addRota(String companhia, String origem,String destination, String aeronave){
        
        if (!dicionarioRotas.containsKey(origem)) {
            dicionarioRotas.put(origem, new ArrayList<>());
        }
        dicionarioRotas.get(origem).add(new Rota(companhia, origem, destination, aeronave));
    }

    public void getRota(String origem) {
        dicionarioRotas.get(origem).stream().forEach(element -> System.out.println(element + " "));    }

    public Rota getCodigoRota(String id) {
        for (Rota r : rotas){
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
    }
}