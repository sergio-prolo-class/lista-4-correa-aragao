package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Blindada;
import ifsc.poo.NaveEspacial;

// A NaveExploradora deve desligar seus holofotes sempre que pousar.

public class NaveExploradora extends NaveEspacial implements Blindada {

    // adicionar implements blindada

    public NaveExploradora(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public String ativarBlindagem() {
        return "Ativando blindagem";
    }
}
