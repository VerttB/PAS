package padroes2.parte2;


public class PagamentoDinheiro extends Pagamento{
    private double valor;
    private padroes2.parte1.Gateway gateway;

    public PagamentoDinheiro(double valor, Gateway gateway) {
        super(valor,gateway);
    }

    public double calcularDesconto() {
        return this.valor * 0.1;
    }


}
