package ifsc.poo.Naves;

import ifsc.poo.Interfaces.Autonoma;

// A NaveSentinela não pode ativar o seu radar caso esteja em alta velocidade (acima de
// 90% da velocidade máxima).

public class NaveSentinela extends NaveExploradora implements Autonoma {

    public NaveSentinela(int velocidadeAtual) {
        super(velocidadeAtual);
    }

    @Override
    public String ativarControleAutomatico() {
        return "";
    }
}
