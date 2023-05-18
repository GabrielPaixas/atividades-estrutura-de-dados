public class Paciente {
    private String nome;
    private String cpf;
    private int nivelPrioridade; //0 - normal, 1 - leve, 2 - moderado, 3 - severo.

    public Paciente(String nome, String cpf, int nivelPrioridade){
        this.nome = nome;
        this.cpf = cpf;
        this.nivelPrioridade = nivelPrioridade;
    }

    public Paciente(){}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNivelPrioridade() {
        return this.nivelPrioridade;
    }

    public void setNivelPrioridade(int nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    
}
