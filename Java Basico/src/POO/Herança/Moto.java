package POO.Herança;
import POO.Polimorfismo.*;

// neste exemplo usamos polimorfismo herdando da classe veiculo com o extends
// e ultilizando o package

public class Moto extends Veiculo {
    
    

    public void ligarMoto(){
        confereCombustivel();
        confereEmbreagem();

        System.out.println("ligar moto!");

        pararVeiculo();

    }
    
    private void confereEmbreagem(){
        System.out.println("coferindo a Embreagem em Neutra!");
    }

    private void confereCombustivel(){
        System.out.println("conferindo o combustivel!");
    }

}
