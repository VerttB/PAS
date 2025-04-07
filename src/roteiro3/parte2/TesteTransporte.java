package roteiro3.parte2;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.0);
        VeiculoTransporte bicicleta = new Bicicleta();

        System.out.printf("A tarifa do Onibus é R$ %.2f \n", onibus.calcularTarifa());
        System.out.printf("A tarifa da Bicicleta é R$ %.2f \n", bicicleta.calcularTarifa());


    }
}
