package roteiro2.parte2;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        RegraDesconto regraDesconto = new DescontoLivre(0.3);

        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), regraDesconto);
        pedido.processarPedido();

    }
}
