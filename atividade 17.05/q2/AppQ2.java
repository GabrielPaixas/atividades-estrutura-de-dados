public class AppQ2 {
    public static void main(String[] args) {
        Fila<Atendente> filaAtendentes = new Fila<>(10);
        Fila<Cliente2> clientes = new Fila<>(20);
        Fila<Cliente2> esperaPrioritaria = new Fila<>(5);
        Fila<Cliente2> esperaComum = new Fila<>(5);
        Fila<Chamada> chamadasFila = new Fila<>(50);
        Atendimento atendimento = new Atendimento();

        filaAtendentes.enqueue(new Atendente("Bia", "1", true));
        filaAtendentes.enqueue(new Atendente("Ricardo", "2", true));
        filaAtendentes.enqueue(new Atendente("Bruna", "3", true));

        clientes.enqueue(new Cliente2("jucelino", "123456",true));
        clientes.enqueue(new Cliente2("antonio", "123456",true));
        clientes.enqueue(new Cliente2("c", "123456",false));
        clientes.enqueue(new Cliente2("d", "123456",false));
        clientes.enqueue(new Cliente2("raimunda", "123456",true));
        clientes.enqueue(new Cliente2("f", "123456",false));


        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum, chamadasFila);
        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum, chamadasFila);
        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum, chamadasFila);
        
        atendimento.finalizarChamada(filaAtendentes,chamadasFila, "2");
        
        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum, chamadasFila);

        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum, chamadasFila);

        System.out.println(chamadasFila.front().getDataInicio());
    }
}
