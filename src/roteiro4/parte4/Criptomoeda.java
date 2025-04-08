package roteiro4.parte4;

public class Criptomoeda extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com criptomoeda.");
    }

    @Override
    public void gerarFatura() {

    }

    @Override
    public void validarSaldo() {
        System.out.println("Validando saldo disponível na carteira de criptomoeda.");
    }
}
