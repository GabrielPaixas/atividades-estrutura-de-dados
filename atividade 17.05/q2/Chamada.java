import java.util.Date;;

public class Chamada {
    private Cliente2 cliente;
    private Atendente atendente;
    private Date dataInicio;
    private Date dataFim;

    public Chamada(Cliente2 cliente, Atendente atendente, Date dataInicio) {
        this.cliente = cliente;
        this.atendente = atendente;
        this.dataInicio = dataInicio;
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

    public Date getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return this.dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
