package padroes2.parte2;

import java.util.Random;

public class Gateway {
    public boolean cobrar(double valor) {
        System.out.println("Valor cobrado : " + valor);
        Random random = new Random();
        boolean autorizado = random.nextBoolean();
        System.out.println("Cobrança Autorizada : "+ autorizado);
        return autorizado;
    }
}

