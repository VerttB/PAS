package padroes2.parte3;

public class PostgresConnection implements BdConnection{
    @Override
    public void connect() {
        System.out.println("Conectando ao postgress");
    }
}
