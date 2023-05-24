public class Cliente2 {
    private String nome;
    private String telefone;
    private boolean priotitario;

    public Cliente2(String nome, String telefone, boolean prioritario) {
        this.nome = nome;
        this.telefone = telefone;
        this.priotitario = prioritario;
    }

    public Cliente2() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getPrioritario() {
        return this.priotitario;
    }

    public void setPrioritario(boolean prioritario) {
        this.priotitario = prioritario;
    }
}
