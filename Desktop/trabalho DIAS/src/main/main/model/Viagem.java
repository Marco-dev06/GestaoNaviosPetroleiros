package pt.dias.navios.model;

import java.time.LocalDate;

public class Viagem {
    private int       id;
    private int       navioId;
    private int       portoOrigemId;
    private int       portoDestinoId;
    private LocalDate dataPartida;
    private LocalDate dataChegada;
    private String    estado;

    public Viagem() {}

    public int       getId()                     { return id; }
    public void      setId(int v)                { this.id = v; }
    public int       getNavioId()                { return navioId; }
    public void      setNavioId(int v)           { this.navioId = v; }
    public int       getPortoOrigemId()          { return portoOrigemId; }
    public void      setPortoOrigemId(int v)     { this.portoOrigemId = v; }
    public int       getPortoDestinoId()         { return portoDestinoId; }
    public void      setPortoDestinoId(int v)    { this.portoDestinoId = v; }
    public LocalDate getDataPartida()            { return dataPartida; }
    public void      setDataPartida(LocalDate v) { this.dataPartida = v; }
    public LocalDate getDataChegada()            { return dataChegada; }
    public void      setDataChegada(LocalDate v) { this.dataChegada = v; }
    public String    getEstado()                 { return estado; }
    public void      setEstado(String v)         { this.estado = v; }

    @Override
    public String toString() { return "Viagem #" + id + " [" + estado + "]"; }
}
