package Projetos.Pratica;

public class Loja {


    public static void main(String[] args) {
        
        Produtos prod01 = new Produtos("Mouse",199.90F,"infokit" );
        

        
    
        System.out.println("Produto: "+ prod01.getNome() + " Preco: " + prod01.getPreco() + " Marca: " + prod01.getMarca() + " Quantidade: " + prod01.getQuantidade() );

    }
}

