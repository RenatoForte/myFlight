public class _App {
    public static void main(String[] args) {


//            GerenciadorCias:

        System.out.println("\n\n----------------------- Companhias Aéreas: -----------------------\n");

        GerenciadorCias gc = new GerenciadorCias();

        gc.addCia("JJ","LATAM Linha Aéreas");
        gc.addCia("G3","GOL Linha Aéreas");
        gc.addCia("TP","TAP Portugal");
        gc.addCia("AD","AZUL Linha Aéreas");
        gc.addCia("AR","Arolineas Argentinas");

        System.out.println("\n   --- Print de todas ---   \n");

        gc.printAll();

        System.out.println("\n   --- Procurando por cada código ---   \n");

        System.out.println(gc.getCiaCod("JJ"));
        System.out.println(gc.getCiaCod("tp"));
        System.out.println(gc.getCiaCod("G3"));
        System.out.println(gc.getCiaCod("ad"));

        System.out.println("\n   --- Procurando por cada nome ---   \n");
        System.out.println(gc.getCiaNome("LATAM Linha Aéreas"));
        System.out.println(gc.getCiaNome("GOL Linha Aéreas"));
        System.out.println(gc.getCiaNome("TAP Portugal"));
        System.out.println(gc.getCiaNome("AZUL Linha Aéreas"));


//            GerenciadorAeronaves:

        System.out.println("\n\n----------------------- Aeronaves: -----------------------\n");

        GerenciadorAeronaves gNaves = new GerenciadorAeronaves();

        gNaves.addNave("733","Boeing 737-300", 140);
        gNaves.addNave("73G","Boeing 737-700", 126);
        gNaves.addNave("380","Airbus Industrie A380", 644);
        gNaves.addNave("764","Boeing 767-400", 304);
        gNaves.addNave("738","Boeing 737-800",166);
        gNaves.addNave("332","Airbus A332",271);
        gNaves.addNave("320","Airbus A320",220);

       System.out.println("\n   --- Print de todas ---   \n");

        System.out.println("Código      | Capacidade      | Nome");
        System.out.println(gNaves.printAll());

        System.out.println("\n   --- Procurando por cada código ---   \n");

        System.out.println(gNaves.getNave("733"));
        System.out.println(gNaves.getNave("73G"));
        System.out.println(gNaves.getNave("380"));
        System.out.println(gNaves.getNave("764"));


//            GerenciadorAeroportos:

        System.out.println("\n\n----------------------- Aeroportos: -----------------------\n");

        GerenciadorAeroporto gPorto = new GerenciadorAeroporto();


        gPorto.addPorto("POA",	"Salgado Filho Intl Apt",	-29.9939,	-51.1711);
        gPorto.addPorto("GRU",	"São Paulo Guarulhos Intl Apt",	-23.4356,	-46.4731);
        gPorto.addPorto("LIS",	"Lisbon",	38.7742,	-9.1342);
        gPorto.addPorto("MIA",	"Miami International Apt", 25.7933, -80.2906);
        gPorto.addPorto("GIG",	"Aeroporto Tom Jobim Rio Galeão", -22.8089, -43.2436);
        gPorto.addPorto("AEP",	"Aeroparque Jorge Newbery", -34.5553, -58.4098);


        System.out.println("\n   --- Print de todos ---   \n");

        gPorto.printAll();

        System.out.println("\n   --- Procurando por cada código ---   \n");

        System.out.println(gPorto.getPorto("poa"));
        System.out.println(gPorto.getPorto("gru"));
        System.out.println(gPorto.getPorto("lis"));
        System.out.println(gPorto.getPorto("mia"));
        System.out.println(gPorto.getPorto("gig"));


//      GerenciadorRota:

        System.out.println("\n\n----------------------- Rotas: -----------------------\n");

        GerenciadorRota gr = new GerenciadorRota();


        gr.addRota(gc.getCiaCod("G3"),gPorto.getPorto("gru"),gPorto.getPorto("poa"),gNaves.getNave("738"));
        gr.addRota(gc.getCiaCod("G3"),gPorto.getPorto("poa"),gPorto.getPorto("gru"),gNaves.getNave("738"));
        gr.addRota(gc.getCiaCod("TP"),gPorto.getPorto("mia"),gPorto.getPorto("lis"),gNaves.getNave("332"));
        gr.addRota(gc.getCiaCod("JJ"),gPorto.getPorto("gru"),gPorto.getPorto("gig"),gNaves.getNave("320"));
        gr.addRota(gc.getCiaCod("AR"),gPorto.getPorto("poa"),gPorto.getPorto("aep"),gNaves.getNave("73g"));
        gr.addRota(gc.getCiaCod("g3"),gPorto.getPorto("poa"),gPorto.getPorto("gig"),gNaves.getNave("380"));

//        G3:POA-GIG
        System.out.println("\n   --- Print de todas ---   \n");

        gr.printAll();

        System.out.println("\n   --- Procurando por cada origem ---   \n");

        System.out.println(gr.getRota("GRU"));
        System.out.println(gr.getRota("pOa"));
        System.out.println(gr.getRota("mia"));


//        GerenciadorVoo:

        System.out.println("\n\n----------------------- Voos: -----------------------\n");


        GerenciadorVoo gv = new GerenciadorVoo();

        gv.addVoo(2016, 8, 10, 8, 00, 90,gr.getCodigoRota("G3:POA-GRU"), Voo.Status.ATRASADO);
        gv.addVoo(2016, 8, 10, 15, 00, 120,gr.getCodigoRota("G3:POA-GIG"), Voo.Status.CONFIRMADO);
        gv.addVoo(2016, 8, 15, 12, 00, 90,gr.getCodigoRota("AR:POA-AEP"), Voo.Status.CANCELADO);

        System.out.println("\n   --- Print de todos ---   \n");

        System.out.println("Data     | Hora | Duração | Rota    | Estado");
        System.out.println(gv.printAll());

        System.out.println("\n   --- Procurando por cada origem ---   ");

        System.out.println(gv.getVoo(2016,8,10));
    }
}