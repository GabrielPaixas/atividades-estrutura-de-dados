import javax.sql.rowset.JoinRowSet;

public class SuperMercado {
    public static void main(String[] args) {
        GerenciarFilas gerencia = new GerenciarFilas();
        Cliente cliente1 = new Cliente("jose", 5);
        Cliente cliente2 = new Cliente("bartolomeu", 7);
        Cliente cliente3 = new Cliente("roberval", 12);
        Cliente cliente4 = new Cliente("joanete", 14);
        Cliente cliente5 = new Cliente("maria", 8);
        Cliente cliente6 = new Cliente("farncisvaldo", 48);
        
        gerencia.chamarCliente(cliente1);
        gerencia.chamarCliente(cliente2);
        gerencia.chamarCliente(cliente3);
        gerencia.chamarCliente(cliente4);
        gerencia.chamarCliente(cliente5);
        gerencia.chamarCliente(cliente6);

        System.out.println("caixa1:");
        gerencia.despacharCliente(1);
        gerencia.despacharCliente(1);
        System.out.println("\ncaixa2:");
        gerencia.despacharCliente(2);
        gerencia.despacharCliente(2);
        System.out.println("\ncaixa3:");
        gerencia.despacharCliente(3);
        System.out.println("\ncaixa4:");
        gerencia.despacharCliente(4);
    }
}
