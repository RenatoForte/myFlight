import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    LocalDateTime datahora;
    Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(int ano,int mes,int dia,int horas,int minutos, long duracao, Rota rota, Status status) {
        this.datahora  = LocalDateTime.of(ano, mes, dia, horas, minutos);
        this.duracao = Duration.ofMinutes(duracao);
        this.rota = rota;
        this.status = status;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    @Override
    public String toString() {
        return "\nData: " +datahora.toLocalDate()+ " | Hora: " +datahora.getHour()+ ":" +datahora.getMinute()+ "Duração | " +duracao+ " | Rota " +rota.getId()+ " | Estado: " + status;
    }
}