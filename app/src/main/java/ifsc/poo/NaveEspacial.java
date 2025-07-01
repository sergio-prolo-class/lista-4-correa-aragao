package ifsc.poo;

//Cada nave possui uma velocidade atual e uma velocidade máxima
// Toda nave deve ser capaz de acelerar (aumentar velocidade atual), frear (reduzir velocidade
// atual), pousar (somente quando velocidade atual for zero) e decolar.

// Classe base abstrata
public abstract class NaveEspacial {
    protected int velocidadeAtual;

    public NaveEspacial(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }




}
