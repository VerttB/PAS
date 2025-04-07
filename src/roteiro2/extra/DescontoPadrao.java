package roteiro2.extra;

public class DescontoPadrao implements RegraDesconto {
    @Override
    public double calcular(double total) {
        return total * 0.9;
    }
}
