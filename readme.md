[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/eVrFUgIm)
# Lista 4 - Frota Espacial Polimórfica

## Nome: Isabella Corrêa

```mermaid
classDiagram
    
    class App {
        - garagem : Set<NaveEspacial>
        + main(args : String[]) : void
    }
    
    class NaveEspacial {
        <<abstract>>
        
        # velocidadeAtual : int
        + acelerar(intensidade : int) : String
        + frear(intensidade : int) : String
        + pousar() : String
        + decolar() : String 
    }
    
    class NaveMineradora {
        - energiaLaserMaxima : int
        - energiaLaserAtual : int
        + minerar(custo : int) : String 
    }
    
    class NaveExploradora {
        - holofotes : bool
        + ligaHolofotes() : String 
    }
     class NaveCargueira {
         - capacidadeMaxima : int
         - cargaAtual : int 
         + carregar(peso : int) : String 
     }
     
     class NaveSentinela {
         - radar : bool
         + ligarRadar() : String
     }
     
     class Tripulada{
         <<interface>>
         + controlarManual() : String
     }
     
     class Blindada {
         <<interface>>
         + ativarBlindagem() : String 
     }
     
     class Autonoma {
         <<interface>>
         + ativarControleAutomatico() : String 
     }
    
    
```