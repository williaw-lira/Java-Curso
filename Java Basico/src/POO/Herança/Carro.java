package POO.Herança;


// nesse exemplo usamos apenas herança sem herdar da classe veiculo

public class Carro  {


    public void ligarCarro(){
        confereCombustivel();
        confereCambio();
        
        System.out.println("carro ligado!");
    }

    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferinfo cambio em P");
    }

    
}
