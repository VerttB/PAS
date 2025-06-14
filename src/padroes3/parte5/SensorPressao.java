package padroes3.parte5;

public class SensorPressao extends Sensor{
    public double pressao;

    public SensorPressao(double pressao) {
        this.pressao = pressao;
    }

    @Override
    public void updateSensor() {
        System.out.println("-------------------------------");
        getTipoAlerta();
        if(this.pressao > 100){
            System.out.println("Pressão acima do recomendado");
        }
        else{
            System.out.println("Pressão em níveis normais");
        }
        System.out.println("-------------------------------");
    }

    @Override
    public void getTipoAlerta() {
        System.out.println("Alerta de pressão");
    }
}
