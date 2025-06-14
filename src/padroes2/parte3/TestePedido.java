package padroes2.parte3;

import java.util.ArrayList;
import java.util.List;

public class TestePedido {
    public static void main(String[] args) {
        
        BdConnection sql = new MySqlConnection();
        List<String> lista = new ArrayList<>();
        lista.add("Pizza");
        lista.add("Bebida");

        PedidoService pedidoService = new PedidoService(sql, lista);
        pedidoService.processarPedido();


        BdConnection postgress = new PostgresConnection();
        List<String> lista2 = new ArrayList<>();
        lista.add("Pizza");
        lista.add("Bebida");

        PedidoService pedidoService2 = new PedidoService(postgress, lista2);
        pedidoService2.processarPedido();
    }
}
