package roteiro5.parte4;

public class NotificacaoWhatsApp implements  Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem whatsapp: " + mensagem);
    }
}
