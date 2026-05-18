package pt.dias.navios.model;

public class Tripulante {
    private int     id;
    private String  nome;
    private String  documento;
    private String  funcao;
    private boolean disponivel;

    public Tripulante() {}

    public int     getId()               { return id; }
    public void    setId(int v)          { this.id = v; }
    public String  getNome()             { return nome; }
    public void    setNome(String v)     { this.nome = v; }
    public String  getDocumento()        { return documento; }
    public void    setDocumento(String v){ this.documento = v; }
    public String  getFuncao()           { return funcao; }
    public void    setFuncao(String v)   { this.funcao = v; }
    public boolean isDisponivel()        { return disponivel; }
    public void    setDisponivel(boolean v){ this.disponivel = v; }

    @Override
    public String toString() { return nome + " (" + funcao + ")"; }
}
