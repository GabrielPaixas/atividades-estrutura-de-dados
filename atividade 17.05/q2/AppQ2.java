public class AppQ2 {
    public static void main(String[] args) {
        Fila<Atendente> filaAtendentes = new Fila<>(10);
        Fila<Cliente2> clientes = new Fila<>(20);
        Fila<Cliente2> esperaPrioritaria = new Fila<>(5);
        Fila<Cliente2> esperaComum = new Fila<>(5);
        Atendimento atendimento = new Atendimento();

        filaAtendentes.enqueue(new Atendente("Bia", "123", true));
        filaAtendentes.enqueue(new Atendente("Ricardo", "123", true));
        filaAtendentes.enqueue(new Atendente("Bruna", "123", true));

        esperaPrioritaria.enqueue(new Cliente2("roberval", "124578", true));

        clientes.enqueue(new Cliente2("jucelino", "123456",true));
        clientes.enqueue(new Cliente2("antonio", "123456",true));
        clientes.enqueue(new Cliente2("c", "123456",false));
        clientes.enqueue(new Cliente2("d", "123456",false));
        clientes.enqueue(new Cliente2("raimunda", "123456",true));
        clientes.enqueue(new Cliente2("f", "123456",false));


        atendimento.iniciarChamada(clientes, filaAtendentes, esperaPrioritaria, esperaComum);

        System.out.println(esperaPrioritaria.size());
        System.out.println(esperaComum.size());
    }
}
