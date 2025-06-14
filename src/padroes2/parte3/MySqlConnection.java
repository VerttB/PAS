package padroes2.parte3;

public class MySqlConnection implements BdConnection {
    public void connect(){
        System.out.println("Conectando ao MYSql");
    }
}
