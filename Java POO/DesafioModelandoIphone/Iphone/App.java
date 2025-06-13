package DesafioModelandoIphone.Iphone;

import DesafioModelandoIphone.Iphone.Controller.Iphone;

public class App {
    public static void main(String[] args) {
        // Criar uma instância do iPhone
        Iphone meuIphone = new Iphone("iPhone") ;

        // Testar funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica();
        meuIphone.pausar();

        // Testar funcionalidades do telefone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        // Testar funcionalidades do navegador web
        meuIphone.exibirPagina("https://www.youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

