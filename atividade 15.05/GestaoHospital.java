public class GestaoHospital {
    public void consultarPaciente(Fila<Paciente> filaPacientes){
        organizarPacientes(filaPacientes);
        System.out.println("O paciente " + filaPacientes.dequeue().getNome() + " sera atendido");
    }

    

    public void organizarPacientes(Fila<Paciente> filaPacientes) {
        Fila<Paciente> prioridade1 = new Fila<>(50);
        Fila<Paciente> prioridade2 = new Fila<>(50);
        Fila<Paciente> prioridade3 = new Fila<>(50);
        Fila<Paciente> prioridade4 = new Fila<>(50);
    
        while (!filaPacientes.isEmpty()) {
            Paciente paciente = filaPacientes.dequeue();
            
            if (paciente.getNivelPrioridade() == 3) {
                prioridade4.enqueue(paciente);
            } else if (paciente.getNivelPrioridade() == 2) {
                prioridade3.enqueue(paciente);
            } else if (paciente.getNivelPrioridade() == 1) {
                prioridade2.enqueue(paciente);
            } else {
                prioridade1.enqueue(paciente);
            }
        }
    
        while (!prioridade4.isEmpty()) {
            filaPacientes.enqueue(prioridade4.dequeue());
        }
        while (!prioridade3.isEmpty()) {
            filaPacientes.enqueue(prioridade3.dequeue());
        }
        while (!prioridade2.isEmpty()) {
            filaPacientes.enqueue(prioridade2.dequeue());
        }
        while (!prioridade1.isEmpty()) {
            filaPacientes.enqueue(prioridade1.dequeue());
        }
    }
    
}
