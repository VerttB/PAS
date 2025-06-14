package padroes3.parte4;

public class TesteNotificacao {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        NotificacaoStrategy email = new NotificacaoEmail();
        NotificacaoStrategy sms = new NotificacaoSMS();
        NotificacaoStrategy whatsapp = new NotificacaoWhatsApp();
        Observer cli01 = new Cliente("Cliente Jose", "jose@empresa.com" , email);
        Observer cli02 = new Cliente("Cliente Maria", "maria@empresa.com", sms);
        Observer func01 = new Funcionario("Funcionario Pedro", "pedro@empresa.com", "Diretor",  whatsapp);
        Observer fornecedor01 = new Fornecedor("Funcionario Pedro", "pedro@empresa.com", "111222333666777", email);

        if(cli01 instanceof Cliente) ((Cliente) cli01).mudarEstrategiaNotificacao(sms);

        newsletter.adicionarObserver(cli01);
        newsletter.adicionarObserver(cli02);
        newsletter.adicionarObserver(func01);
        newsletter.adicionarObserver(fornecedor01);
        newsletter.enviarMensagem("Oferta Especial !");
    }
}
