package roteiro6.parte3;

public class SqlServer  implements Connection{
    @Override
    public void connect() {
        System.out.println("Conectado ao SQL server");
    }
}
