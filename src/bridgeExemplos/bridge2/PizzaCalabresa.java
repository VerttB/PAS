package bridgeExemplos.bridge2;

public class PizzaCalabresa extends Pizza {
    @Override
    public void criarPizza() {
        System.out.println("Criando pizza de calabresa");
        System.out.println("Adicionando " + this.sabor);
        System.out.println("Adicionando " + this.recheio);
        System.out.println("Adicionando " + this.tempero);

    }

}
