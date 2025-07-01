package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Blindada;
import ifsc.poo.Interfaces.Tripulada;
import ifsc.poo.NaveEspacial;

// A NaveCargueira deve ativar a blindagem sempre que sua carga atual ultrapassar 70% da
// sua carga máxima e só pode desativar a blindagem se estiver pousada

public class NaveCargueira extends NaveEspacial implements Blindada, Tripulada {

    public NaveCargueira(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public String ativarBlindagem() {
        return "Ativando a blindagem";
    }

    @Override
    public String controlarManual() {
        return "Controle manual";
    }
}
