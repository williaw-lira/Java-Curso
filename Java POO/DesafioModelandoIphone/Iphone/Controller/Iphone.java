package DesafioModelandoIphone.Iphone.Controller;

import DesafioModelandoIphone.Iphone.Repository.Navegador;
import DesafioModelandoIphone.Iphone.Repository.ReprodutorMusica;
import DesafioModelandoIphone.Iphone.Repository.Telefone;
import DesafioModelandoIphone.Iphone.Service.NavegadorInterface;
import DesafioModelandoIphone.Iphone.Service.ReprodutorMusicaInterface;
import DesafioModelandoIphone.Iphone.Service.TelefoneInterface;


public class Iphone implements Navegador, ReprodutorMusica,Telefone{
    private String modelo;
    
    public Iphone(String modelo){
        this.modelo = modelo;
    }
    
        // ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    
    public void selecionarMusica() {
        System.out.println("Música selecionada: ");
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

}
