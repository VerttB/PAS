package padroes5.parte2;

public class ControladorAereo {
    private boolean permitidoAterrissar;
    private boolean permitidoDecolar;
    private static ControladorAereo instance = new ControladorAereo();

    private ControladorAereo() {
        this.permitidoAterrissar = false;
        this.permitidoDecolar = true;
    }

    public void solicitarAterrissagem() {
        if (this.permitidoAterrissar) {
            System.out.println("Permissão para aterrissagem concedida ");
            this.permitidoAterrissar = false;
            this.permitidoDecolar = true;
        } else {
            System.out.println("Permissão para aterrissagem negada ");
        }
    }

    public static ControladorAereo getInstance(){
        return instance;
    }

    public void solicitarDecolagem() {
        if (this.permitidoDecolar) {
            System.out.println("Permissão para decolar concedida ");
            this.permitidoAterrissar = true;
            this.permitidoDecolar = false;
        } else {
            System.out.println("Permissão para decolagem negada ");
        }
    }
}
