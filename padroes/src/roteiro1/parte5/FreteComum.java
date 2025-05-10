package roteiro1.parte5;

public class FreteComum implements ComportamentoFrete{
    @Override
    public double calculerFrete(double valor) {
        return valor * 0.05;
    }
}
