package Exercitando;
import Exercitando.SmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " +smartTv.ligada);
        System.out.println("Volume Atual? " + smartTv.volume);
        System.out.println("Canal Atual? " + smartTv.canal);
        
        smartTv.Ligar();
        System.out.println("novo Status da Tv Ligada? " +smartTv.ligada);

        smartTv.AumentarVolume();
        System.out.println("novo Status  Volume Atual? " + smartTv.volume);

        smartTv.MudarCanal(13);
        System.out.println("novo Status Canal Atual? " + smartTv.canal);
    } 
}
