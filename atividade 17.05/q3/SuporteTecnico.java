import java.util.Date;

public class SuporteTecnico {
    Fila<Chamado> filaChamados; 

    public SuporteTecnico() {
       filaChamados = new Fila<>(50);
    }

    public void adicionarChamado(Chamado chamado){
        filaChamados.enqueue(chamado);
    }

    public Chamado atenderChamado(){
        Chamado chamado = filaChamados.dequeue();
        if(chamado != null){
            chamado.setInicioAtendimento(new Date());
        }
        return chamado;
    }

    public void concluirChamado(Chamado chamado){
        chamado.setFimAtendimento(new Date());
    }

}
