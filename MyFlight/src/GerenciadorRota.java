import java.util.ArrayList;

public class GerenciadorRota {
    private ArrayList<Rota> rotas = new ArrayList<Rota>();
    private ArrayList<String> getRotas = new ArrayList<>();

    public void addRota(CiaAerea companhia, Aeroporto origem,Aeroporto destination, Aeronave aeronave){
        rotas.add(new Rota(companhia,origem,destination,aeronave));
    }

    public Rota printAll(){
        System.out.println("Companhia     | Origem      | Destinho    | Aeronave");
        for (Rota r : rotas){
            return r;
        }
        return null;
    }

    public ArrayList<String> getRota(String origem) {
        ArrayList<String> listaRotas = new ArrayList<>();
        for (Rota r : rotas){
            if (r.getOrigem().getCodigo().equalsIgnoreCase(origem)) {
                listaRotas.add(r.getId());
            }
        }
        return listaRotas;
    }

    public Rota getCodigoRota(String id) {
        for (Rota r : rotas){
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
    }
}
