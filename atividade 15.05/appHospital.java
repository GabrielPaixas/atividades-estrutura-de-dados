public class appHospital {
    public static void main(String[] args) {
        GestaoHospital gestao = new GestaoHospital();
        Fila<Paciente> pacientes = new Fila<>(50);

        Paciente paciente1 = new Paciente("D", "12345678", 0);
        Paciente paciente2 = new Paciente("C", "12345678", 1);
        Paciente paciente3 = new Paciente("B", "12345678", 2);
        Paciente paciente4 = new Paciente("A", "12345678", 3);

        pacientes.enqueue(paciente3);        
        pacientes.enqueue(paciente4);
        pacientes.enqueue(paciente1);
        pacientes.enqueue(paciente2);

        gestao.consultarPaciente(pacientes);
        gestao.consultarPaciente(pacientes);
        gestao.consultarPaciente(pacientes);
        gestao.consultarPaciente(pacientes);
    }
}
