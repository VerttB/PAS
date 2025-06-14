package bridgeExemplos.bridge2;

public class Bridge2 {
    public static void main(String[] args) {
        Restaurante brasil = new RestauranteBrasileiro(new PizzaCalabresa());
        Restaurante italia = new RestauranteItaliano(new PizzaFrango());


        brasil.fazerPizza();
        italia.fazerPizza();

    }
}
