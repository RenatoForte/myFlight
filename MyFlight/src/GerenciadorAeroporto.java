import java.util.ArrayList;

public class GerenciadorAeroporto {
    private ArrayList<Aeroporto> aeroportos = new ArrayList<Aeroporto>();

    public void addPorto(String codigo,String nome,double latitude,double longitude){
        aeroportos.add(new Aeroporto(codigo, nome, latitude, longitude));
    }

    public void printAll(){
        System.out.println("Códigos    | Nomes");
        for (Aeroporto ap : aeroportos){
            System.out.println(ap);
        }
    }

    public Aeroporto getPorto(String codigo) {
        for (Aeroporto ap : aeroportos){
            if (ap.getCodigo().equalsIgnoreCase(codigo)) {
                return ap;
            }
        }
        return null;
    }
}
