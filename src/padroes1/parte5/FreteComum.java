package padroes1.parte5;

import padroes1.parte5.ComportamentoFrete;

public class FreteComum implements ComportamentoFrete {
    @Override
    public double calculerFrete(double valor) {
        return valor * 0.05;
    }
}
