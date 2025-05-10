package roteiro1.parte5;

public class PedidoEletronico extends Pedido{

    private String setor;
    public PedidoEletronico(double valor,ComportamentoFrete comportamentoFrete, String setor) {
        super(valor, comportamentoFrete);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


}
