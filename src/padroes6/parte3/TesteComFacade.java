package padroes6.parte3;

public class TesteComFacade {

    public static void main(String[] args) {

        Facade.getInstance().registrarCliente("Jose", 222);
        Facade.getInstance().comprar(1, 222);
        Facade.getInstance().comprar(2, 222);
        Facade.getInstance().finalizarCompra(222);
    }
}
