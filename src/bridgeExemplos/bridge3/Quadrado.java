package bridgeExemplos.bridge3;

public class Quadrado extends Forma{
    protected Quadrado(Cor c) {
        super(c);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Pintando quadrado de ");
        this.cor.aplicarCor();
    }
}
