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
        
        # velocidadeAtual
    }
    
    class NaveMineradora {
        
    }
    
    class NaveExploradora {
        
    }
     class NaveCargueira {
         
     }
     
     class NaveSentinela {
         
     }
     
     class Tripulada{
         <<interface>>
     }
     
     class Blindada {
         <<interface>>
     }
     
     class Autonoma {
         
     }
    
    
```