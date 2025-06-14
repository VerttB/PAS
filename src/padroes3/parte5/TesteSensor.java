package padroes3.parte5;

public class TesteSensor {
    public static void main(String[] args) {
        Sensor pressao = new SensorPressao(50);
        Sensor umidade = new SensorUmidade(100);
        Sensor temperatura = new SensorTemperatura(50);

        PainelControle painel = new PainelControle();

        painel.adicionarAlerta(pressao);
        painel.adicionarAlerta(umidade);
        painel.adicionarAlerta(temperatura);


        painel.enviarMensagem(" Avaliando Alertas.......");

    }
}
