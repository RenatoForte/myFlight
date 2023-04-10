import java.util.ArrayList;

public class GerenciadorCias {
    private static ArrayList<CiaAerea> empresas = new ArrayList<>();

    public void addCia(String codigo, String nome){
        empresas.add(new CiaAerea(codigo, nome));
    }

    public void printAll(){
        System.out.println("Códigos    | Nomes");
        for (CiaAerea i : empresas){
            System.out.println(i);
        }
    }

    public CiaAerea getCiaCod(String codigo) {
        for (CiaAerea i : empresas){
            if (i.getCodigo().equalsIgnoreCase(codigo)) {
                return i;
            }
        }
        return null;
    }

    public CiaAerea getCiaNome(String nome) {
        for (CiaAerea i : empresas){
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }
}
