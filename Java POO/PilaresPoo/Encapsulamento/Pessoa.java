package PilaresPoo.Encapsulamento;
public class Pessoa {
    // sempre quando eu ultilizo o private ou protecd estou encapsulando

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        senha();
    }

    public int getIdade (){
        return idade;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

        protected void senha(){
            if(this.getIdade() >= 18){
                System.out.println("Senha: "+ 9099);

            }else{
                System.out.println("menor de idade não tem senha!");
            }
    }

}
