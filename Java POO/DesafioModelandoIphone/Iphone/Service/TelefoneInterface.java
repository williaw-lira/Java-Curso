package DesafioModelandoIphone.Iphone.Service;

public class TelefoneInterface {
    private String numero;

    public String getNumero(String numero){
        return numero;
    }

    public void setNumero(){
        this.numero = numero; 
    }

    // telefone
    public void ligar(String numero){
        System.out.println("Ligando para numero: " + this.getNumero(numero));
        
    }
    public void atender(){
        System.out.println("Telefone atendido!");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz Iniciado! ");
    }



}
