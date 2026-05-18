package pt.dias.navios.model;

public class Carga {
    private int    id;
    private String descricao;
    private int    tipoCargaId;
    private double volume;
    private double peso;

    public Carga() {}

    public int    getId()              { return id; }
    public void   setId(int v)         { this.id = v; }
    public String getDescricao()       { return descricao; }
    public void   setDescricao(String v){ this.descricao = v; }
    public int    getTipoCargaId()     { return tipoCargaId; }
    public void   setTipoCargaId(int v){ this.tipoCargaId = v; }
    public double getVolume()          { return volume; }
    public void   setVolume(double v)  { this.volume = v; }
    public double getPeso()            { return peso; }
    public void   setPeso(double v)    { this.peso = v; }

    @Override
    public String toString() { return descricao; }
}
