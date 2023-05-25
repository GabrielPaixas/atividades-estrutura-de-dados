import java.util.Date;

public class Atendimento {
    ChatBot chat = new ChatBot();

    public void iniciarChamada(Fila<Cliente2> clientes, Fila<Atendente> atendentesFila,
        Fila<Cliente2> esperaPrioritaria,
        Fila<Cliente2> esperaComum, Fila<Chamada> chamadasFila) {

        Fila<Atendente> tempAtendentes = new Fila<>(5);
        Fila<Cliente2> prioritario = new Fila<>(10);
        Fila<Cliente2> comumFila = new Fila<>(10);

        while (!esperaPrioritaria.isEmpty()) {
            prioritario.enqueue(esperaPrioritaria.dequeue());
        }
        while (!esperaComum.isEmpty()) {
            comumFila.enqueue(esperaComum.dequeue());
        }

        while (!clientes.isEmpty()) {
            Cliente2 cliente = clientes.dequeue();

            if (cliente.getPrioritario()) {
                prioritario.enqueue(cliente);
            } else {
                comumFila.enqueue(cliente);
            }
        }

        Atendente atendenteLivre = null;

        while (!atendentesFila.isEmpty()) {
            Atendente atendente = atendentesFila.dequeue();
            if (atendente.isDisponivel()) {
                atendenteLivre = atendente;
            }
            tempAtendentes.enqueue(atendente);
        }
        
        while(!tempAtendentes.isEmpty()){
            atendentesFila.enqueue(tempAtendentes.dequeue());
        }

        while (!prioritario.isEmpty()) {
            clientes.enqueue(prioritario.dequeue());
        }
        while (!comumFila.isEmpty()) {
            clientes.enqueue(comumFila.dequeue());
        }

        if(atendenteLivre != null){
            chamadasFila.enqueue(new Chamada(clientes.front(), atendenteLivre, new Date()));
            System.out.println(clientes.front().getNome() + " esta sendo atendido");
            clientes.dequeue();
        }

        while (!clientes.isEmpty()) {
            if (clientes.front().getPrioritario()) {
                esperaPrioritaria.enqueue(clientes.dequeue());
            } else {
                esperaComum.enqueue(clientes.dequeue());
            }
        }

    }

    public void finalizarChamada(Fila<Atendente> atendentes, Fila<Chamada> chamadasFila, String id) {
        Fila<Atendente> temp = new Fila<>(10);
        Fila<Chamada> tempChamada = new Fila<>(50);
    
        Atendente atendenteEncontrado = new Atendente();
        
        // Procura o atendente pelo ID e marca como disponível
        while (!atendentes.isEmpty()) {
            Atendente atendente = atendentes.dequeue();
            if (atendente.getId().equals(id)) {
                System.out.println("O atendente " + atendente.getNome() + " está disponível");
                atendente.setDisponivel(true);
                atendenteEncontrado = atendente;
            }
            temp.enqueue(atendente);
        }
        
        // Reenfileira os atendentes
        while (!temp.isEmpty()) {
            atendentes.enqueue(temp.dequeue());
        }
    
        // Finaliza chamadas associadas ao atendente encontrado
        while (!chamadasFila.isEmpty()) {
            Chamada chamada = chamadasFila.dequeue();
            if (chamada.getAtendente().equals(atendenteEncontrado)) {
                chamada.setDataFim(new Date());
            } else {
                tempChamada.enqueue(chamada);
            }
        }
        
        while(!tempChamada.isEmpty()){
            chamadasFila.enqueue(tempChamada.dequeue());
        }
    }
    
}