package padroes8.parte2;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter{

    private SistemaEstoque sistemaEstoque;

    public SistemaEstoqueAdapterIBM(){
        this.sistemaEstoque = new SistemaEstoque("IBM");
    }

    public void diminuirQuantidadeItem(){
        this.sistemaEstoque.removerItemEstoque();
    }

    public void aumentarQuantidadeItem(){
        this.sistemaEstoque.adicionarItemEstoque();
    }
}
