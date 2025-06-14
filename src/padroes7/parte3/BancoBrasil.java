package padroes7.parte3;

public class BancoBrasil extends Banco {
    @Override
    public Boleto criarBoleto(int vencimento, double valor) {
        return switch (vencimento) {
            case 10 -> new BoletoBrasil10Dias(valor);
            case 30 -> new BoletoBrasil30Dias(valor);
            case 60 -> new BoletoBrasil60Dias(valor);
            default -> throw new UnsupportedOperationException("ERRO: Vencimento indisponível");
        };
    }
}

