public class Rota implements Comparable<CiaAerea> {
    private String companhia;
    private String origem;
    private String destino;
    private String aeronave;

    public Rota(String companhia, String origem,String destino, String aeronave) {
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public String getId(){
        return companhia+":"+origem+"-"+destino;
    }

    public String getOrigem() {
        return origem;
    }

    public String getCia(){
        return companhia;
    }

    @Override
    public String toString() {
        return getId() + aeronave;
    }

    public int compareTo(CiaAerea outra){
    return companhia.compareTo(outra.getNome());
    }
}
