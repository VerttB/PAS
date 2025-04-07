package roteiro2.extra;

public class DescontoLivre implements RegraDesconto {
    private int desconto;

    public DescontoLivre(int desconto){
        if(desconto > 1) desconto /= 100;
        this.desconto = desconto;
    }
    @Override
    public double calcular(double total) {
        return total * this.desconto;
    }
}
