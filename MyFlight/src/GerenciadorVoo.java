import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoo {
    private ArrayList<Voo> voos = new ArrayList<Voo>();

    public void addVoo(int ano, int mes, int dia, int horas, int minutos, long duracao, Rota rota, Voo.Status status) {
        voos.add(new Voo(ano,mes,dia,horas,minutos,duracao,rota,status));
    }

    public ArrayList<Voo> printAll(){
        ArrayList<Voo> listaVoos = new ArrayList<>();
        for (Voo v : voos){
            listaVoos.add(v);
        }
        return listaVoos;
    }

    public ArrayList<Voo> getVoo(int ano, int mes, int dia){
        ArrayList<Voo> listaVoo = new ArrayList<>();
        for (Voo v : voos) {
            if (v.datahora.toLocalDate().equals(LocalDate.of(ano, mes, dia))) {
                listaVoo.add(v);
            }
        }
        return listaVoo;
    }
}
//    .toLocalDate
//    localDate of(int ano, int mes, int dia)
