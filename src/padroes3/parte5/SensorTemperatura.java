package padroes3.parte5;

public class SensorTemperatura extends Sensor{

    public double temperatura;

    public SensorTemperatura( double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void updateSensor() {
        System.out.println("-------------------------------");
        getTipoAlerta();

        if(this.temperatura > 40){
            System.out.println("Alertar!!! Temperatura acima do recomendado");
        }
        else{
            System.out.println("Temperatura em níveis normais");
        }
        System.out.println("-------------------------------");
    }

    @Override
    public void getTipoAlerta() {
        System.out.println("Alerta de Temperatura");
    }
}
