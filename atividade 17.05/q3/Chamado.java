import java.util.Date;

public class Chamado {
    private int prioridade;
    private String descricao;
    private String cliente;
    private Date inicioAtendimento;
    private Date fimAtendimento;

    public Chamado(int prioridade, String descricao, String cliente){
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.cliente = cliente;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getInicioAtendimento() {
        return this.inicioAtendimento;
    }

    public void setInicioAtendimento(Date inicioAtendimento) {
        this.inicioAtendimento = inicioAtendimento;
    }

    public Date getFimAtendimento() {
        return this.fimAtendimento;
    }

    public void setFimAtendimento(Date fimAtendimento) {
        this.fimAtendimento = fimAtendimento;
    }
}
