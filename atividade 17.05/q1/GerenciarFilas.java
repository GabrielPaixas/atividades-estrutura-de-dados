public class GerenciarFilas {
    Fila<Cliente> caixa1 = new Fila<>(10);
    Fila<Cliente> caixa2 = new Fila<>(10);
    Fila<Cliente> caixa3 = new Fila<>(10);
    Fila<Cliente> caixa4 = new Fila<>(10);

    public void chamarCliente(Cliente cliente){
        if (caixa1.isEmpty()) {
            caixa1.enqueue(cliente);
            return;
        }else if (caixa2.isEmpty()) {
            caixa2.enqueue(cliente);
            return;
        }else if (caixa3.isEmpty()) {
            caixa3.enqueue(cliente);
            return;
        }else if (caixa4.isEmpty()) {
            caixa4.enqueue(cliente);
            return;
        }

        if (caixa1.size() <= caixa2.size() && caixa1.size() <= caixa3.size() && caixa1.size() <= caixa4.size()) {
            caixa1.enqueue(cliente);
        } else if(caixa2.size() <= caixa1.size() && caixa2.size() <= caixa3.size() && caixa2.size() <= caixa4.size()){
            caixa2.enqueue(cliente);
        }else if(caixa3.size() <= caixa2.size() && caixa3.size() <= caixa1.size() && caixa3.size() <= caixa4.size()){
            caixa3.enqueue(cliente);
        }else if(caixa4.size() <= caixa2.size() && caixa4.size() <= caixa3.size() && caixa4.size() <= caixa1.size()){
            caixa4.enqueue(cliente);
        }
    }

    public Cliente despacharCliente(int caixa){
        if(caixa == 1){
            System.out.println("O cliente " + caixa1.front().getNome() + " foi despachado");
            return caixa1.dequeue();
        }else if(caixa == 2){
            System.out.println("O cliente " + caixa2.front().getNome() + " foi despachado");
            return caixa2.dequeue();
        }else if(caixa == 3){
            System.out.println("O cliente " + caixa3.front().getNome() + " foi despachado");
            return caixa3.dequeue();
        }else if(caixa == 4){
            System.out.println("O cliente " + caixa4.front().getNome() + " foi despachado");
            return caixa4.dequeue();
        }
        return null;
    }
}
