public class Chamada {
    private Cliente2 cliente;
    private Atendente atendente;


    public Chamada(Cliente2 cliente, Atendente atendente) {
        this.cliente = cliente;
        this.atendente = atendente;
    }

    public Chamada() {
    }

    public Cliente2 getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente2 cliente) {
        this.cliente = cliente;
    }

    public Atendente getAtendente() {
        return this.atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
}
