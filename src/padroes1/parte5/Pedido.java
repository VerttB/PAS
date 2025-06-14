package padroes1.parte5;

public abstract class  Pedido {
    private double valor;
    protected ComportamentoFrete comportamentoFrete;

    public Pedido(double valor, ComportamentoFrete comportamentoFrete){
        this.valor = valor;
        this.comportamentoFrete = comportamentoFrete;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularFrete(){
        return  comportamentoFrete.calculerFrete(this.valor);
    }
    public void setComportamentoFrete(ComportamentoFrete comportamentoFrete){
        this.comportamentoFrete = comportamentoFrete;
    }
}
