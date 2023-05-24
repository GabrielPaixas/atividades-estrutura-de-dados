public class Atendimento {
    Fila<Chamada> chamadasFila = new Fila<>(50);
    ChatBot chat = new ChatBot();

    public void iniciarChamada(Fila<Cliente2> clientes, Fila<Atendente> atendentesFila,
            Fila<Cliente2> esperaPrioritaria,
            Fila<Cliente2> esperaComum) {

        Fila<Atendente> tempAtendentes = new Fila<>(5);

        Fila<Cliente2> prioritario = new Fila<>(10);
        Fila<Cliente2> comumFila = new Fila<>(10);

        while(!esperaPrioritaria.isEmpty()){
            prioritario.enqueue(esperaPrioritaria.dequeue());
        }
        while(!esperaComum.isEmpty()){
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

        while (!atendentesFila.isEmpty()) {
            if (atendentesFila.front().isDisponivel()) {
                if(!prioritario.isEmpty()){
                    System.out.println("atendendo " + prioritario.front().getNome());
                    chamadasFila.enqueue(new Chamada(prioritario.dequeue(), atendentesFila.front()));
                }else if(!comumFila.isEmpty()){
                    chat.atendimentoAutomatico(clientes.front());
                    chamadasFila.enqueue(new Chamada(comumFila.dequeue(), atendentesFila.front()));
                }else{
                    System.out.println("Sem clientes aguardando");
                }
            }
            tempAtendentes.enqueue(atendentesFila.dequeue());
        }

        while (!prioritario.isEmpty()) {
            clientes.enqueue(prioritario.dequeue());
        }
        while (!comumFila.isEmpty()) {
            clientes.enqueue(comumFila.dequeue());
        }

        while(!clientes.isEmpty()){
            if(clientes.front().getPrioritario()){
                esperaPrioritaria.enqueue(clientes.dequeue());
            }else{
                esperaComum.enqueue(clientes.dequeue());
            }
        }
        
    }
}