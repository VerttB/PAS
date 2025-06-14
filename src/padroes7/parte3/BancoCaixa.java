package padroes7.parte3;

public class BancoCaixa extends Banco {


    @Override
    public Boleto criarBoleto(int vencimento, double valor) {
        return switch (vencimento) {
            case 10 -> new BoletoCaixa10Dias(valor);
            case 30 -> new BoletoCaixa30Dias(valor);
            case 60 -> new BoletoCaixa60Dias(valor);
            default -> throw new UnsupportedOperationException("ERRO: Vencimento indisponível");
        };
    }
}

