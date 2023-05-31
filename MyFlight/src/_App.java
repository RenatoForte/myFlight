import java.io.BufferedReader;
import java.io.FileReader;

public class _App {
        public static void main(String[] args) {


//            GerenciadorCias:

        System.out.println("\n\n----------------------- Companhias Aéreas: -----------------------\n");

        GerenciadorCias gc = new GerenciadorCias();
        try{
                String currentLine;
                FileReader fr = new FileReader("MyFlight\\out\\Arquivos\\airlines.dat");
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((currentLine = br.readLine()) != null){
                        String [] linha = currentLine.split(";");
                        gc.addCia(linha[0], linha[1]);
                }
                br.close();
        }catch (Exception e){System.out.println("Erro na leitura");}


//            GerenciadorAeronaves:
        System.out.println("\n\n----------------------- Aeronaves: -----------------------\n");

        GerenciadorAeronaves gNaves = new GerenciadorAeronaves();

        try{
                String currentLine;
                FileReader fr = new FileReader("MyFlight\\out\\Arquivos\\equipment.dat");
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((currentLine = br.readLine()) != null){
                        String [] linha = currentLine.split(";");
                        gNaves.addNave(linha[0], linha[1], linha[2]);
                }
                br.close();
        }catch (Exception e){System.out.println("Erro na leitura");}

        //gNaves.printAll();



//            GerenciadorAeroportos:

        System.out.println("\n\n----------------------- Aeroportos: -----------------------\n");

        GerenciadorAeroporto gPorto = new GerenciadorAeroporto();


        try{
                String currentLine;
                FileReader fr = new FileReader("MyFlight\\out\\Arquivos\\airports.dat");
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((currentLine = br.readLine()) != null){
                        String [] linha = currentLine.split(";");
                        gPorto.addPorto(linha[0], linha[3], linha[1],linha[2]);
                }
                br.close();
        }catch (Exception e){System.out.println("Erro na leitura");}


        //      GerenciadorRota:

        System.out.println("\n\n----------------------- Rotas: -----------------------\n");

        GerenciadorRota gr = new GerenciadorRota();

        try{
                String currentLine;
                FileReader fr = new FileReader("MyFlight\\out\\Arquivos\\routes.dat");
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                while((currentLine = br.readLine()) != null){
                        String [] linha = currentLine.split(";");
                        gr.addRota(linha[0], linha[1], linha[2],linha[3]);
                }
                br.close();
        }catch (Exception e){System.out.println("Erro na leitura");}

        //gr.printAll();

/*
//        GerenciadorVoo:

        System.out.println("\n\n----------------------- Voos: -----------------------\n");


        GerenciadorVoo gv = new GerenciadorVoo();

        gv.addVoo(2016, 8, 10, 8, 00, 90,gr.getCodigoRota("G3:POA-GRU"), Voo.Status.ATRASADO);
        gv.addVoo(2016, 8, 10, 15, 00, 120,gr.getCodigoRota("G3:POA-GIG"), Voo.Status.CONFIRMADO);
        gv.addVoo(2016, 8, 15, 12, 00, 90,gr.getCodigoRota("AR:POA-AEP"), Voo.Status.CANCELADO);

        System.out.println("\n   --- Print de todos ---   \n");

        gv.printAll();

        System.out.println("\n   --- Procurando por data ---   ");

        gv.getVoo(2016,8,10);



        
        // PARTE 2

        Geo g1 = gPorto.getGeo("POA");
        Geo g2 = gPorto.getGeo("GRU");


        System.out.println("\n" + Geo.aeroDist(g1,g2));
        System.out.println("\n" + g1.distancia(g2));

        System.out.println("\nTotal de empresas: " + CiaAerea.getTotalCias());

        gPorto.ordenaNome();
        System.out.println();

        gr.ordenaCiaNome();
        System.out.println();
        
        gNaves.ordenaNaves();
        */
        }
}
