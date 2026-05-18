package pt.dias.navios.model;

public class Navio {
    private int    id;
    private String nome;
    private String codigoIMO;
    private int    tipoNavioId;
    private double capacidadeMax;
    private int    numTanques;
    private String bandeira;
    private int    anoFabrico;
    private String estado;
    private int    portoId;

    public Navio() {}

    public int    getId()                  { return id; }
    public void   setId(int id)            { this.id = id; }
    public String getNome()                { return nome; }
    public void   setNome(String v)        { this.nome = v; }
    public String getCodigoIMO()           { return codigoIMO; }
    public void   setCodigoIMO(String v)   { this.codigoIMO = v; }
    public int    getTipoNavioId()         { return tipoNavioId; }
    public void   setTipoNavioId(int v)    { this.tipoNavioId = v; }
    public double getCapacidadeMax()       { return capacidadeMax; }
    public void   setCapacidadeMax(double v){ this.capacidadeMax = v; }
    public int    getNumTanques()          { return numTanques; }
    public void   setNumTanques(int v)     { this.numTanques = v; }
    public String getBandeira()            { return bandeira; }
    public void   setBandeira(String v)    { this.bandeira = v; }
    public int    getAnoFabrico()          { return anoFabrico; }
    public void   setAnoFabrico(int v)     { this.anoFabrico = v; }
    public String getEstado()              { return estado; }
    public void   setEstado(String v)      { this.estado = v; }
    public int    getPortoId()             { return portoId; }
    public void   setPortoId(int v)        { this.portoId = v; }

    @Override
    public String toString() { return nome + " (" + codigoIMO + ")"; }
}
