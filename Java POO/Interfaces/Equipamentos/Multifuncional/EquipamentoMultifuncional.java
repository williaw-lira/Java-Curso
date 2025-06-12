package Interfaces.Equipamentos.Multifuncional;

import Interfaces.Equipamentos.copiadora.Copiadora;
import Interfaces.Equipamentos.digitalizadora.Digitalizadora;
import Interfaces.Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    public void copiar(){
        System.out.println("COPIANDO");
    }

    public void imprimir(){
        System.out.println("IMPRIMINDO");
    }

    public void digitalizar(){
        System.out.println("DIGITALIZANDO");
    }
    
} 