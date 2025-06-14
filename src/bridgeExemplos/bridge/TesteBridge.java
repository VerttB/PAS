package bridgeExemplos.bridge;

public class TesteBridge {
    public static void main(String[] args) {
        Moto moto = new Moto(new Produzir(), new Montar());
        Carro carro = new Carro(new Produzir(), new Montar());

        moto.criar();

        carro.criar();

    }
}
