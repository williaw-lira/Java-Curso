package Projetos.Pratica;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class JogoWill {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        for (int i = 0; i < 10 ; i++) {
            int numeroAleatorio = random.nextInt(10);
            
            if (numeroAleatorio <= 5) {
                System.out.println("informe um valor menor ou igual a 5");
                int numeroUsuario = scanner.nextInt();
                
            

            }else if(numeroAleatorio <=10){
                System.out.println("informe um valor maior que 5 e menor ou igual a 10");
                int numeroUsuario = scanner.nextInt();

            }else
            {
                System.out.println("informe um valor valido");

                int numeroUsuario = scanner.nextInt();

            }

            for (String string : args) {
                
            }
            
        }

    }
    
}
