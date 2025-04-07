package roteiro2.extra;

import java.util.List;

public class PedidoService {
    private List<String> itens;
    private double total;
    private RegraDesconto regraDesconto;

    public PedidoService(List<String> itens, RegraDesconto regraDesconto){
        this.itens = itens;
        this.regraDesconto = regraDesconto;
        this.total = calcularTotal();
    }
    private double calcularTotal(){
        double total = 0;
        for (String item : itens){
            switch (item) {
                case "Camiseta" -> total += 50;
                case "Calça" -> total += 100;
                case "Jaqueta" -> total += 200;
            }
        }
        return total;
    }

    public void processarPedido(){
        double valorFinal = regraDesconto.calcular(total);
        System.out.println("Pedido processado. Valor final com desconto: R$ " + valorFinal);
    }
}
