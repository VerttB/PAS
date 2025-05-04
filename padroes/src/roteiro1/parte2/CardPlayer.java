package roteiro1.parte2;

public class CardPlayer extends Player {
    public CardPlayer(String nome) {
        super(nome);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + "é um jogar muito calmo");
    }


    @Override
    public void correr() {
        System.out.println(super.nome + " - Não Corre ! Ele pensa !");
    }
}

