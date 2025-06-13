package DesafioModelandoIphone.Iphone.Service;

import DesafioModelandoIphone.Iphone.Repository.Navegador;

public class NavegadorInterface implements Navegador{
    private String url ;
    
    public String getUrl(String url){
    return url;
    }

    
    public void setUrl(){
        this.url = url;
    }

        // navegador 
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina: "+ this.getUrl(url));
    }


    public void adicionarNovaAba(){
        System.out.println("Nova Aba Adicionada!");
    }
    public void atualizarPagina(){
        System.out.println("Pagina Atualizada!");
    }


}
