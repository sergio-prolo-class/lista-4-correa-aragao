package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Blindada;
import ifsc.poo.NaveEspacial;

public class NaveExploradora extends NaveEspacial implements Blindada {

    // adicionar implements blindada

    public NaveExploradora(int velocidadeAtual) {
        super(velocidadeAtual);
    }
}
