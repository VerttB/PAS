package bridgeExemplos.bridge;

public class Moto extends Veiculo {
    protected Moto(Oficina o1, Oficina o2) {
        super(o1, o2);
    }

    @Override
    public void criar() {
        System.out.print("Moto ");
        oficina1.trabalhar();
        oficina2.trabalhar();
    }
}
