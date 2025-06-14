package padroes4.parte1;

public class Fuzil implements Arma{
    @Override
    public void carregar() {
        System.out.println("Carregando fuzil");
    }

    @Override
    public void atirar() {
        System.out.println("Esse tiro faz um estrago ");
    }

    @Override
    public void mirar() {
        System.out.println("Alvo certeiro");
    }
}
