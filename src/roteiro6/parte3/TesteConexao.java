package roteiro6.parte3;

public class TesteConexao {
    public static void main(String[] args) {
        ServicoQuarto quarto = new ServicoQuarto(new MysqlConnection());
        quarto.verificarQuarto();

        ServicoReserva reserva = new ServicoReserva(new OracleConnection());
        reserva.criarReserva();

        RelatorioReserva relatorio = new RelatorioReserva(new SqlServer());
        relatorio.gerarRelatorio();
    }
}
