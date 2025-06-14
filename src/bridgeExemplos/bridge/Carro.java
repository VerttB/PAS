package bridgeExemplos.bridge;

public class Carro extends Veiculo {
    protected Carro(Oficina o1, Oficina o2) {
        super(o1, o2);
    }

    @Override
    public void criar() {
        System.out.print("Carro ");
        oficina1.trabalhar();
        oficina2.trabalhar();
    }
}
