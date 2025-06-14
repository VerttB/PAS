package bridgeExemplos.bridge2;

public abstract class Pizza {
    protected String sabor;
    protected String recheio;
    protected String tempero;


    public abstract void criarPizza();

    protected void setSabor(String sabor) {
        this.sabor = sabor;
    }

    protected void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    protected void setTempero(String tempero) {
        this.tempero = tempero;
    }
}
