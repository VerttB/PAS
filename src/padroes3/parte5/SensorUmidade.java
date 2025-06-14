package padroes3.parte5;

public class SensorUmidade extends Sensor{
    private double umidade;

    public SensorUmidade( double umidade) {
        this.umidade = umidade;
    }


    @Override
    public void updateSensor() {
        System.out.println("-------------------------------");
        getTipoAlerta();

        if(this.umidade < 30){
            System.out.println("Alertar!!! Umidade abaixo do recomendado");
        }
        else{
            System.out.println("Umidade em níveis normais");
        }
        System.out.println("-------------------------------");
    }

    @Override
    public void getTipoAlerta() {
        System.out.println("Alerta de Umidade");
    }
}
