package bridgeExemplos.bridge2;

public abstract class Restaurante {
    protected Pizza pizza;

    protected Restaurante(Pizza pizza){
        this.pizza = pizza;
    }

    protected abstract void adicionarTempero();
    protected abstract void adicionarSabor();
    protected abstract void adicionarRecheio();
    public void fazerPizza(){

        adicionarSabor();
        adicionarTempero();
        adicionarRecheio();
        pizza.criarPizza();

    }
}
