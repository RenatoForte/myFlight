import java.util.HashMap;
import java.util.Map;

public class GerenciadorCias {
    Map<String, CiaAerea> dicionarioCias = new HashMap<>();

    public void addCia(String codigo, String nome){
        dicionarioCias.put(codigo, new CiaAerea(codigo, nome));
    }

    public CiaAerea getCiaCod(String codigo) {
        return dicionarioCias.get(codigo);
    }
}