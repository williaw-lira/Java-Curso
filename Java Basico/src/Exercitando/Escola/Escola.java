package Exercitando.Escola;

public class Escola {
    
    public static void main(String[] args) {
        
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(16);
        felipe.setSexo("masculino");

        System.out.println("o aluno "+ felipe.getNome() + " tem " + felipe.getIdade() + " anos");

        Professor anderson = new Professor();
            anderson.setNome("Anderson");
            anderson.setIdade(30);
            anderson.setMateria("matematica");  
            
        System.out.println("o professor "+ anderson.getNome() + " tem " + anderson.getIdade() + " anos " + "e da aula de " + anderson.getMateria());
    }



}
