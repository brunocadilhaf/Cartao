public class Cliente {
    private String nome;
    private Debito debito;
    private Credito credito;

    public Cliente(String nome, Debito debito) {
        this.nome = nome;
        this.debito = debito;
    }

    public Cliente(String nome, Credito credito) {
        this.nome = nome;
        this.credito = credito;
    }

    public Cliente(String nome, Debito debito, Credito credito) {
        this.nome = nome;
        this.debito = debito;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Debito getDebito() {
        return debito;
    }
    public void setDebito(Debito debito) {
        this.debito = debito;
    }
    public Credito getCredito() {
        return credito;
    }
    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}
