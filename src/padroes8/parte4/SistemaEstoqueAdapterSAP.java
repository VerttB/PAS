package padroes8.parte4;

import servico.SistemaEstoque;
public class SistemaEstoqueAdapterSAP implements ISistemaEstoqueAdapter{
    private SistemaEstoque sistemaEstoqueSAP;

    public SistemaEstoqueAdapterSAP(){
        this.sistemaEstoqueSAP = new SistemaEstoque("SAP");
    }
    @Override
    public void diminuirQuantidadeItem() {
        this.sistemaEstoqueSAP.removerItemEstoque();
    }

    @Override
    public void aumentarQuantidadeItem() {
        this.sistemaEstoqueSAP.adicionarItemEstoque();
    }
}
