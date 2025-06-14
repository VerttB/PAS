package bridgeExemplos.bridge2;

public class RestauranteItaliano extends Restaurante{
    protected RestauranteItaliano(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void adicionarTempero() {
        pizza.setTempero("Tudo de bom");
    }

    @Override
    protected void adicionarSabor() {
        pizza.setSabor("Sabor italiano Secreto");
    }

    @Override
    protected void adicionarRecheio() {
        pizza.setRecheio("Recheio italiano secreto");
    }
}
