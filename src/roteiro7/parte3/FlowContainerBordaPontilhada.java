package roteiro7.parte3;

import java.util.ArrayList;
import java.util.List;

public class FlowContainerBordaPontilhada extends FlowContainer {

    private List<Component> elements;

    public FlowContainerBordaPontilhada() {
        super();
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o Flow Container Borda pontilhada");
        System.out.println("Elementros presentes no container");
        System.out.println(super.elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}
