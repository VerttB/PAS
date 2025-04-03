package roteiro1.parte2;

import java.util.List;

public class PedidoService {
    private MySqlConnection connection;
    private List<String> itens;

    public PedidoService(MySqlConnection connection, List<String> itens){
        this.connection =  connection;
        this.itens = itens;
    }

    public void processarPedido(){
        this.connection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processador. Valor total: R$" + total);
    }

    public double calcularTotal(){
        double total = 0;
        for (String item: itens){
            if (item.equals("Pizza")) total += 30;
            else if (item.equals("Bebida")) total += 10;
        }
        return total;
    }

}
