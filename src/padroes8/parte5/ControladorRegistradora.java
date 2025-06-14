package padroes8.parte5;


public class ControladorRegistradora {
    private SistemaContabilAdapter sistemaContabilAdapter;
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;

    public ControladorRegistradora(){
        System.out.println("Registrador iniciado");
    }

    public void criarSistemaContabilAdapter(String nome){
        switch (nome) {
            case "IBM" -> this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
            case "DELL" -> this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
            case "SAP" -> this.sistemaContabilAdapter = new SistemaContabilAdapterSAP();
        }

    }
    public void criarSistemaEstoqueAdapter(String nome){

        switch (nome) {
            case "IBM" -> this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
            case "DELL" -> this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
            case "SAP" -> this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterSAP();
        }


    }

    public void diminuirQuantidadeItem(){
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
    }

    public void registrarVendaSistemaContabil(){
        this.sistemaContabilAdapter.finalizarVenda();
    }

}
