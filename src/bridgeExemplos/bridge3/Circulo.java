package bridgeExemplos.bridge3;

public class Circulo extends Forma{

    protected Circulo(Cor c) {
        super(c);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Pintando circulo de ");
        this.cor.aplicarCor();
    }
}
