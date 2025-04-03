package roteiro1.parte4;

import java.util.List;

public class PedidoService {
    private MySqlConnection connection;
    private List<String> itens;

    public PedidoService(List<String> itens){
        this.connection = new MySqlConnection();
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
        return calcularDesconto(total);
    }

    public double calcularDesconto(double total){
        int desconto = 0;
        if (this.itens.contains("Pizza")){
            desconto = 10;
            if (this.itens.contains("Bebida")) desconto = 15;
        }

        return total = total - (total * desconto/100);
    }
}
