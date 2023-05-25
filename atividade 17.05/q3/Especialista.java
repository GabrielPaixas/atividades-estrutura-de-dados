public class Especialista {
    private String nome;
    private String especialidade;

    public Especialista(String nome, String especialista){
        this.nome = nome;
        this.especialidade = especialista;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
