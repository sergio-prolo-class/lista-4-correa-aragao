package ifsc.poo.Naves;

// Tripulada

import ifsc.poo.Interfaces.Tripulada;
import ifsc.poo.NaveEspacial;

public class NaveMineradora extends NaveEspacial implements Tripulada {

    public NaveMineradora(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public String controlarManual() {
        return "Colocar alguma coisa";
    }
}
