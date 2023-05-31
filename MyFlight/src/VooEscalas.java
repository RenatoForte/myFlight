import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo
{
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private Rota rotaFinal;
    
    
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, int duracao) {
        super(rota, datahora, Duration.ofMinutes(duracao));
        this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() {
        return rotaFinal; }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }
}