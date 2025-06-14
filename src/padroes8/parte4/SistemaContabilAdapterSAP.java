package padroes8.parte4;

import dominio.SistemaContabil;
import servico.SistemaEstoque;

public class SistemaContabilAdapterSAP implements ISistemaContabilAdapter {
    private SistemaContabil sistemaContabilSAP;


    public SistemaContabilAdapterSAP(){
        this.sistemaContabilSAP = new SistemaContabil("SAP");
    }
    @Override
    public void finalizarVenda() {
        this.sistemaContabilSAP.registrarVenda();
    }

    @Override
    public void registrarImposto() {
        this.sistemaContabilSAP.calcularImposto();
    }
}
