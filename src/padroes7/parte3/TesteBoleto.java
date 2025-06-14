package padroes7.parte3;

public class TesteBoleto {
    public static void main(String[] args) {
        Banco banco = new BancoCaixa();
        Banco bb = new BancoBrasil();
        try {
            banco.gerarBoleto(10, 100);
            bb.gerarBoleto(10,100);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
