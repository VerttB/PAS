package padroes8.parte3;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterDELL implements ISistemaEstoqueAdapter {
    private SistemaEstoque sistemaEstoque;

    public SistemaEstoqueAdapterDELL(){
        this.sistemaEstoque = new SistemaEstoque("DELL");
    }

    public void diminuirQuantidadeItem(){
        this.sistemaEstoque.removerItemEstoque();
    }

    public void aumentarQuantidadeItem(){
        this.sistemaEstoque.adicionarItemEstoque();
    }
}
