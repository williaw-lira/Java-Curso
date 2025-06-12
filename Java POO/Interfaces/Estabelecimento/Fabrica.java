package Interfaces.Estabelecimento;

import Interfaces.Equipamentos.Multifuncional.EquipamentoMultifuncional;
import Interfaces.Equipamentos.impressora.Deskejet;
import Interfaces.Equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
    Impressora impressora = new Deskejet();
        impressora.imprimir();
        
    
        System.out.println("------------------");

    EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();

        multifuncional.copiar();
        multifuncional.digitalizar();
        multifuncional.imprimir();

    }
}
