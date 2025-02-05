package Exercitando;
// nesse exercicio vamos criar uma classe para representar uma tv smart

// 1 - criar uma classe para representar uma tv smart boolean ligada, int volume, int canal
// 2 - podera ligar e desligar a tv
// 3 - podera aumentar e diminuir o volume +1 e -1
// 4 - podera mudar o canal de 1 em 1 ou definir um canal
// 5 - criar um metodo para imprimir o status da tv

public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void AumentarVolume(){
        volume++;
    }

    public void DiminuirVolume(){
        volume--;
    }

    public void MudarCanal(int novoCanal){
        canal = novoCanal;
    }

}

