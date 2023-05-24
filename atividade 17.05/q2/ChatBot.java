public class ChatBot {
    public void atendimentoAutomatico(Cliente2 cliente){
        if(cliente.getPrioritario()){
            System.out.println("Ola " + cliente.getNome() + " sua chamada é prioritaria e seu atendimento acontecera logo.");
        }else{
            System.out.println("Ola " + cliente.getNome() + " como posso ajudar?");
        }
    }
}
