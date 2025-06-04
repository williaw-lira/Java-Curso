package Exercitando.Escola;

public class Professor {
    private String nome;
    private int idade ;
    private String materia;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade( int idade){
        this.idade = idade;
    }

    public String getMateria (){
        return materia;
    }

    public void setMateria (String materia){
        this.materia = materia;
    }
}
