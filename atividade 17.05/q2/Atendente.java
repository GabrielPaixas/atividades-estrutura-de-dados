public class Atendente {
    private String nome;
    private String id;
    private boolean disponivel;

    public Atendente(String nome, String id, boolean disponivel){
        this.nome = nome;
        this.id = id;
        this.disponivel = disponivel;
    }

    public Atendente(){}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
