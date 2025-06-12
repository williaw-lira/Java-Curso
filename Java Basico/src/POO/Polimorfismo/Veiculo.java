package POO.Polimorfismo;
import POO.Abstract.*;

// nessa classe alem dela ser classe pai de Moto.java ela e classe filha de Para.java
// fazendo assim uso do abstract e função de parar 

public class Veiculo extends Parar {
    // encapsulando com private
    private String chassi;

    
    public String getChassi (){
        return chassi;
    }

    public void setChassi (String chassi){
        this.chassi = chassi;
        
    }

    public void pararVeiculo(){
        System.out.println("veiculo parado!");
    }

    
    
}
