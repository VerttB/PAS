package padroes3.parte5;

import java.util.ArrayList;

public class PainelControle {

    private ArrayList<Alerta> alertaSensores;



    public PainelControle(){
        this.alertaSensores = new ArrayList<Alerta>();
    }
    public void adicionarAlerta(Alerta alerta){
        this.alertaSensores.add(alerta);
    }


    public void enviarMensagem(String mensagem){
        for (Alerta alerta : alertaSensores) {
            System.out.println("O painel de controle detectou os seguintes dados");

            alerta.updateSensor();
        }
    }

}
