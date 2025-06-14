package padroes8.parte5;

public class ControladorEstoque {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;

    public ControladorEstoque(){
        System.out.println("Controlador de Sistema Contabil Criado");
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("IBM")) this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("DELL")) this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
    }

    public void aumentarQuantidadeItem(){
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}
