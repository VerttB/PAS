package padroes4.parte1;

public class Atirador {
    private String nome;
    private Arma arma;

    public Atirador(String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
    }

    public void carregarArma(){
        System.out.printf("Ação-" + this.nome + ": " );
        this.arma.carregar();
    }

    public void fazerMira(){
        System.out.printf("Ação-" + this.nome + ": " );
        this.arma.mirar();
    }

    public void usarArma(){
        System.out.printf("Ação-" + this.nome + ": " );
        this.arma.atirar();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
