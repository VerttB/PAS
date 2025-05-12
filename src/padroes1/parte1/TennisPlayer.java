package padroes1.parte1;

public class TennisPlayer extends  Player{
    public TennisPlayer(String nome) {
        super(nome);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " rebate a bola por cima do oponente");
    }
}
