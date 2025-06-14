package bridgeExemplos.bridge;

public class Produzir implements Oficina{
    @Override
    public void trabalhar() {
        System.out.println(". Produzida");
    }
}
