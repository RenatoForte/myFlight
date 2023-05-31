import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    LocalDateTime datahora;
    Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        this.datahora = datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public Voo(long duracao, Rota rota, Status status) {
        this.datahora  = LocalDateTime.of(2016, 8, 12, 12, 00);
        this.duracao = Duration.ofMinutes(duracao);
        this.rota = rota;
        this.status = status;
    }

    public Voo (Rota rota, LocalDateTime datahora, Duration duracao) {
        this.rota = rota;
        this.datahora = datahora;
        this.duracao = duracao;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public String formatDateTime(LocalDateTime dataHora) {
        DateTimeFormatter dh = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dataHora.format(dh);
    }

    @Override
    public String toString() {
        return formatDateTime(datahora) + " | Duração: " + duracao + " | Estado: " + status + " | Rota " + rota.getId();
    }
}