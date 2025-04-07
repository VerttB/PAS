package roteiro2.extra;

public class DescontoVip implements RegraDesconto {
    @Override
    public double calcular(double total) {
        return total * 0.8;
    }
}
