package bridgeExemplos.bridge2;

public class PizzaFrango extends Pizza{
    @Override
    public void criarPizza() {
        System.out.println("Criando pizza de frango");
        System.out.println("Adicionando " + this.sabor);
        System.out.println("Adicionando " + this.recheio);
        System.out.println("Adicionando " + this.tempero);

    }
}
