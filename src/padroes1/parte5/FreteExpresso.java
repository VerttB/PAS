package padroes1.parte5;

public class FreteExpresso implements ComportamentoFrete{
    @Override
    public double calculerFrete(double valor) {
        return valor * 0.1;
    }
}
