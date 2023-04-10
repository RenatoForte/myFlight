public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo,String descricao,int capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return String.format("Código: %s | Capacidade: %d | Nome: %s", codigo,capacidade,descricao);
    }
}
