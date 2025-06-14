package padroes2.parte3;

import java.util.List;

public class PedidoService {
    private BdConnection connection;
    private CalculadoraPreco calculadora;
    private List<String> itens;


    public PedidoService(BdConnection connection, List<String> itens){
        this.connection =  connection;
        this.calculadora = new CalculadoraPreco();
        this.itens = itens;
    }

    public void processarPedido(){
        this.connection.connect();
        double total = this.calculadora.calcularTotal(this.itens);
        System.out.println("Pedido processador. Valor total: R$" + total);
    }


}
