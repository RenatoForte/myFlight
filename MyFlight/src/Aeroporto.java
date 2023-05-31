public class Aeroporto implements Comparable<Aeroporto> {
    private String codigo;
    private String nome;
    private Geo local;
    private String descricao;




    public Aeroporto(String codigo,String nome,double latitude,double longitude) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = new Geo(latitude, longitude);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getGeo(){
        return local;
    }
    
    @Override
    public String toString(){
    return String.format("Código: %s | Nome: %s", codigo,nome);
    }

    public int compareTo(Aeroporto outra){
        return descricao.compareTo(outra.descricao);
    }
}