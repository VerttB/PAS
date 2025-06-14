package padroes3.parte4;

public class Funcionario implements Observer {
    private String nome;
    private String email;
    private String cargo;

    private NotificacaoStrategy estrategiaNotificacao;


    public Funcionario(String nome, String email, String cargo, NotificacaoStrategy estrategiaNotificacao) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.estrategiaNotificacao = estrategiaNotificacao;
    }

    public void  mudarEstrategiaNotificacao(NotificacaoStrategy estrategia){
        this.estrategiaNotificacao = estrategia;
    }
    @Override
    public void update(String mensagem) {
        String destinatario = (estrategiaNotificacao instanceof NotificacaoEmail) ? "email" : "telefone";
        StringBuilder mensagemFormatada = new StringBuilder();
        mensagemFormatada.append("---------------NOTIFICACAO " + this.getTipoObserver() + "------------------\n");
        mensagemFormatada.append("Notificação enviada para " + nome + " (" + destinatario + ")\n");
        mensagemFormatada.append(mensagem + "\n");
        mensagemFormatada.append("-----------------------------------------------------------------------\n");
        this.estrategiaNotificacao.enviarMensagem(destinatario, mensagemFormatada.toString());
    }

    @Override
    public String getTipoObserver() {
        return "Funcionário";
    }
}
