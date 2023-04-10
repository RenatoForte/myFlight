import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public void addNave(String codigo, String descricao, int capacidade) {
        aeronaves.add(new Aeronave(codigo, descricao, capacidade));
    }

    public Aeronave printAll(){
        for (Aeronave an : aeronaves){
            return an;
        }
        return null;
    }
    public Aeronave getNave(String codigo) {
        for (Aeronave an : aeronaves){
            if (an.getCodigo().equals(codigo.toUpperCase())) {
                return an;
            }
        }
        return null;
    }

    public void removeNave(Aeronave aeronave) {
        aeronaves.remove(aeronave);
    }

    public Aeronave getNave(int index) {
        return aeronaves.get(index);
    }

    public int getSize() {
        return aeronaves.size();
    }
}
