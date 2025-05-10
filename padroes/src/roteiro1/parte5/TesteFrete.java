package roteiro1.parte5;

public class TesteFrete {
    public static void main(String[] args) {
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteComum freteComum = new FreteComum();

        PedidoEletronico pedidoEletronico = new PedidoEletronico(5.0, freteExpresso, "eletronico");
        System.out.println(" Frete do setor" + pedidoEletronico.getSetor() + " : " + pedidoEletronico.calcularFrete());

        PedidoMoveis pedidoMoveis = new PedidoMoveis(5.0, freteExpresso, "moveis");
        System.out.println(" Frete do setor" + pedidoMoveis.getSetor() + " : " + pedidoMoveis.calcularFrete());

        pedidoMoveis.setComportamentoFrete(freteComum);
        pedidoEletronico.setComportamentoFrete(freteComum);
        System.out.println(" Frete do setor" + pedidoEletronico.getSetor() + " : " + pedidoEletronico.calcularFrete());

        System.out.println(" Frete do setor" + pedidoMoveis.getSetor() + " : " + pedidoEletronico.calcularFrete());



    }
}
