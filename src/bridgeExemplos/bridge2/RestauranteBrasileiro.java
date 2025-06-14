package bridgeExemplos.bridge2;

public class RestauranteBrasileiro extends Restaurante{
    protected RestauranteBrasileiro(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void adicionarTempero() {
        pizza.setTempero("Todos os temperos");
    }

    @Override
    protected void adicionarSabor() {
        pizza.setSabor("Sabor brasileiro secreto");
    }

    @Override
    protected void adicionarRecheio(){
        pizza.setRecheio("Recheio brasileiro secreto");
    }
}
