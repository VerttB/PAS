package bridgeExemplos.bridge3;

public abstract class Forma {

    protected Cor cor;

    protected Forma(Cor c){
        this.cor = c;
    }

    abstract public void aplicarCor();
}
