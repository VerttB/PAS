package roteiro6.parte1;

public class ServicoReserva {
    private MysqlConnection connection;

    public ServicoReserva() {
        this.connection = new MysqlConnection();
    }

    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de criação de reserva");
    }
}
