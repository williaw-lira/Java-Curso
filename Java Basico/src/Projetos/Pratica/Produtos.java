package Projetos.Pratica;

public class Produtos {
    private String nome;
    private float preco;
    private String marca;
    private int quantidade;

        public Produtos(String nome, float preco, String marca ){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;        
    }
        public Produtos (int quantidade){
        this.quantidade = quantidade;
    }


    public String getNome(){
        return nome;
    }

    public float getPreco(){
        return preco;
    }


    public String getMarca(){
        return marca;
    }


    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(){
        this.quantidade = quantidade;
    }
}
