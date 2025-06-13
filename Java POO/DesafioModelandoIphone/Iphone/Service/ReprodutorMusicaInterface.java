package DesafioModelandoIphone.Iphone.Service;

import DesafioModelandoIphone.Iphone.Repository.ReprodutorMusica;

public class ReprodutorMusicaInterface implements ReprodutorMusica {

        // reprodutor musica
    public void tocar (){
        System.out.println("Tocando Musica!");
    }
    public void pausar(){
        System.out.println("Musica Despausada!");
    }
    public void selecionarMusica(){
        System.out.println("Selecionado a Musica!");
    }
}
