public class Cliente {
    private String nome;
    private int nItens;
    
    public Cliente(String nome, int nItens){
        this.nome = nome;
        this.nItens = nItens;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getItens() {
        return this.nItens;
    }

    public void setItens(int itens) {
        this.nItens = itens;
    }
}
