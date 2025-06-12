package PilaresPoo;

import PilaresPoo.Encapsulamento.Pessoa;

public class Main {
    
    public static void main(String[] args) {
        Pessoa william = new Pessoa("William", 10);
        william.getNome();
        william.getIdade();

        System.out.println("Nome: " + william.getNome() + " Idade: " + william.getIdade());
    }
    

    

}
