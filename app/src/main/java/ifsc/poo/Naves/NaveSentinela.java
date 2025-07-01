package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Autonoma;

public class NaveSentinela extends NaveExploradora implements Autonoma {

    // adicionar interface autonoma

    public NaveSentinela(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public String ativarControleAutomatico() {
        return "";
    }
}
