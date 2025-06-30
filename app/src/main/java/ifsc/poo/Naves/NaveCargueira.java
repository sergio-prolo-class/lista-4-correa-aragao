package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Blindada;
import ifsc.poo.NaveEspacial;

public class NaveCargueira extends NaveEspacial implements Blindada {

    public NaveCargueira(int velocidadeAtual) {
        super(velocidadeAtual);
    }
}
