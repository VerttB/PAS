package padroes3.parte4;

public class NotificacaoWhatsApp implements NotificacaoStrategy {
    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("------------------------------------------------------ ");
        System.out.println("Whatsapp enviado para " + destinatario + ": \n" + mensagem);
    }
}
