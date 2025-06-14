package padroes8.parte6;


public class ControladorRegistradora {
    private SistemaContabilAdapter sistemaContabilAdapter;
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private AdapterFactory factory;

    public ControladorRegistradora(){
        System.out.println("Registrador iniciado");
        this.factory = AdapterFactory.getInstance();
    }

    public void criarSistemaContabilAdapter(String nome){
          this.sistemaContabilAdapter = this.factory.criarSistemaContabilAdapter(nome);
    }
    public void criarSistemaEstoqueAdapter(String nome){

        this.sistemaEstoqueAdapter = this.factory.criarSistemaEstoqueAdapter(nome);

    }

    public void diminuirQuantidadeItem(){
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
    }

    public void registrarVendaSistemaContabil(){
        this.sistemaContabilAdapter.finalizarVenda();
    }

}
