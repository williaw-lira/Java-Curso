package Exercitando.Laços;

public class Tabuada {
    
    public static void main(String[] args) {
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("Tabuada do: " + numero);
            
            for (int i = 0; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            
            System.out.println();
        }
    }
}
