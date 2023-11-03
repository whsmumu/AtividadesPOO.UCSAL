public class Laboratorio {
    private int id;
    private String sigla;
    private Equipamentos conjunto;
    private final int capacidade = 20;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public Equipamentos getConjunto() {
        return conjunto;
    }
    public void setConjunto(Equipamentos conjunto) {
        this.conjunto = conjunto;
    }
    public int getCapacidade() {
        return capacidade;
    }
    
    public String toString() {
        return "Laboratorio [id=" + id + ", sigla=" + sigla + ", conjunto=" + conjunto + ", capacidade=" + capacidade
                + "]";
    }
}