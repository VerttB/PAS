package bridgeExemplos.bridge;

public class Montar implements Oficina{

    @Override
    public void trabalhar() {
        System.out.println("e montado");
    }
}
