package pt.dias.navios.model;

public class Porto {
    private int    id;
    private String nome;
    private String pais;

    public Porto() {}

    public int    getId()           { return id; }
    public void   setId(int v)      { this.id = v; }
    public String getNome()         { return nome; }
    public void   setNome(String v) { this.nome = v; }
    public String getPais()         { return pais; }
    public void   setPais(String v) { this.pais = v; }

    @Override
    public String toString() { return nome + " (" + pais + ")"; }
}
