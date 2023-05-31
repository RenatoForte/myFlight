public class Aeronave implements Imprimivel, Comparable<Aeronave> {
    private String codigo;
    private String descricao;
    private String capacidade;

    public Aeronave(String codigo, String descricao, String capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public void imprimir() {
        System.out.println(codigo + " - " + descricao);
    }

    public int compareTo(Aeronave outra) {
        return descricao.compareTo(outra.descricao);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return String.format("Código: %s | Capacidade: %s | Nome: %s", codigo, capacidade, descricao);
    }
}
