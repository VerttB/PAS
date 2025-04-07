package roteiro3.parte1;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.0);
        System.out.printf("A tarifa do Onibus é R$ %.2f \n", onibus.calcularTarifa());

        VeiculoTransporte bicileta = new Bicicleta();
        try {
            System.out.printf("A tarifa da bicicleta é R$ %f \n", bicileta.calcularTarifa());
        }catch (UnsupportedOperationException e){
            System.out.println("Bicileta não tem tarifa");
        }
    }
}
