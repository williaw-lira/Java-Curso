package POO.Herança;
import POO.Abstract.*;

import POO.Polimorfismo.Veiculo;

public class Autodromo {

    public static void main(String[] args) {
        Carro gol = new Carro ();
        gol.ligarCarro();

        System.out.println("--------------------------------------------------");

        
        Moto hornet = new Moto();
        
        hornet.setChassi("019012");
        
        System.out.println("Chassi da Moto: " + hornet.getChassi());
        hornet.ligarMoto();
        
        // aqui podemos usar o abstract como coringa mas apenas quando ele tem uma classe filha e apenas oq esta dentro dela
        Parar coringa = hornet;
        coringa.pararVeiculo();
        

    

    }
    

}
