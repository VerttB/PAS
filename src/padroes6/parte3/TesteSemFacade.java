package padroes6.parte3;

public class TesteSemFacade {

    public static void main(String[] args) {


        Database db = new Database();

        Cliente c1 = new Cliente(1, "José");
        db.addCliente(c1);

        CarrinhoCompra carrinho = new CarrinhoCompra();
        c1.setCarrinho(carrinho);
        Produto p1 = db.selectProduto(1);
        Produto p2 = db.selectProduto(2);
        c1.getCarrinho().addProduto(p1);
        c1.getCarrinho().addProduto(p2);


        double total = c1.getCarrinho().getTotalCompra();
        db.processarPagamento(c1, total);
    }
}
