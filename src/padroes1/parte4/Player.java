package padroes1.parte4;

public abstract class Player {
    protected String nome;
    protected RunBehavior habilidadeCorrer;

    public Player(String nome, RunBehavior habilidadeCorrer) {
        this.nome = nome;
        this.habilidadeCorrer = habilidadeCorrer;
    }

    public void treinar() {
        System.out.println(this.nome + " Executando o treino !");
    }

    public void estiloCompetidor() {
        System.out.println(this.nome + " Muito competitivo !");
    }

    public abstract void definirTatica();

    public void correr(){
        this.habilidadeCorrer.correr();
    }


    public void setHabilidadeCorrer(RunBehavior habilidadeCorrer) {
        this.habilidadeCorrer = habilidadeCorrer;
    }
}
