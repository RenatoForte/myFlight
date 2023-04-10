public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo local;

    public Aeroporto(String codigo,String nome,double latitude,double longitude) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public class Geo {
        private double latitude;
        private double longitude;

        public Geo(double latitude, double longitude){
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
    @Override
    public String toString(){
        return String.format("Código: %s | Nome: %s", codigo,nome);
    }
}
