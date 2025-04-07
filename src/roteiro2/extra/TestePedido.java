package roteiro2.extra;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        RegraDesconto descontoPadrao = new DescontoPadrao();
        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), descontoPadrao);
        pedido.processarPedido();

        RegraDesconto descontoVip = new DescontoVip();
        PedidoService pedidoVip = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), descontoVip);
        pedidoVip.processarPedido();
    }
}
