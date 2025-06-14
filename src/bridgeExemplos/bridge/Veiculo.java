package bridgeExemplos.bridge;

public abstract class Veiculo {
    protected Oficina oficina1;
    protected Oficina oficina2;

    protected Veiculo(Oficina o1, Oficina o2){
        this.oficina1 = o1;
        this.oficina2 = o2;
    }

    abstract public void criar();
}
