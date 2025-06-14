package bridgeExemplos.bridge3;

public class Bridge3 {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(new CorAzul());
        quadrado.aplicarCor();

        Forma circulo = new Circulo(new CorVermelha());
        circulo.aplicarCor();
    }
}
