package padroes7.parte2;

public class TesteBoleto {
    public static void main(String[] args) {
        BancoCaixa banco = new BancoCaixa(new BoletoSimpleFactory());
        try {
            banco.gerarBoleto(10, 100);
            banco.gerarBoleto(30, 100);
            banco.gerarBoleto(60, 100);
            banco.gerarBoleto(90, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
