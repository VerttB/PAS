package padroes8.parte3;


import dominio.SistemaContabil;
import servico.SistemaEstoque;

public class ControladorRegistradora {
    private ISistemaContabilAdapter sistemaContabilAdapter;
    private ISistemaEstoqueAdapter sistemaEstoqueAdapter;

    public ControladorRegistradora(){
        System.out.println("Registrador iniciado");
    }

    public void criarSistemaContabilAdapter(String nome){
        if (nome.equals("IBM")) this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
        else if (nome.equals("DELL")) this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();

    }
    public void criarSistemaEstoqueAdapter(String nome){
        if (nome.equals("IBM")) this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("DELL")) this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();

    }

    public void diminuirQuantidadeItem(){
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
    }

    public void registrarVendaSistemaContabil(){
        this.sistemaContabilAdapter.finalizarVenda();
    }

}
