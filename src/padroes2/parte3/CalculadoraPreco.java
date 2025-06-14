package padroes2.parte3;
import java.util.List;

public class CalculadoraPreco {

    public double calcularTotal(List<String> itens){
        double total = 0;
        for (String item: itens){
            if (item.equals("Pizza")) total += 30;
            else if (item.equals("Bebida")) total += 10;
        }
        return calcularDesconto(total, itens);
    }

    public double calcularDesconto(double total, List<String> itens){
        int desconto = 0;
        if (itens.contains("Pizza")){
            desconto = 10;
            if (itens.contains("Bebida")) desconto = 15;
        }

        return total = total - (total * desconto/100);
    }
}

