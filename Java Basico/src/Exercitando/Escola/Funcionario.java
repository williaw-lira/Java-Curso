package Exercitando.Escola;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario; 

    public String getNome(){
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }


    public double getSalario(){
    return salario;
    }

    protected void setSalario(double salario){
        this.salario = salario;
    }
}
