public class Rota {
    private CiaAerea companhia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea companhia, Aeroporto origem,Aeroporto destino, Aeronave aeronave) {
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public String getId(){
        return companhia.getCodigo()+":"+origem.getCodigo()+"-"+destino.getCodigo();
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    @Override
    public String toString() {
        return String.format("Companhia: %s | Origem: %s | Destino %s | Aeronave: %s", companhia.getCodigo(),origem.getCodigo(),destino.getCodigo(),aeronave.getCodigo());
    }
}
