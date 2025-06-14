package padroes8.parte6;

import servico.SistemaEstoque;

public class SistemaEstoqueAdapterDELL extends SistemaEstoqueAdapter {

    public SistemaEstoqueAdapterDELL(){

        this.sistemaEstoque = new SistemaEstoque("DELL");
    }

}
