import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorVoo {
    ArrayList<Voo> voos = new ArrayList<>();
    Map<LocalDate, ArrayList<Voo>> dicionarioVoo = new HashMap<>();

    public void addVoo(int ano, int mes, int dia, int horas, int minutos, long lDuracao, Rota rota, Voo.Status status) {

        LocalDateTime dataHora  = LocalDateTime.of(ano,mes,dia,horas,minutos);
        Duration duracao = Duration.ofMinutes(lDuracao);

        if (!dicionarioVoo.containsKey(dataHora.toLocalDate())) {
            dicionarioVoo.put(dataHora.toLocalDate(), new ArrayList<>());
        }
        dicionarioVoo.get(dataHora.toLocalDate()).add(new Voo(dataHora, duracao, rota, status));
    }


    public void getVoo(int ano, int mes, int dia){
        LocalDate procurando = LocalDate.of(ano,mes,dia);
        dicionarioVoo.get(procurando).stream().forEach(element -> System.out.println(element + " "));
    }
}
