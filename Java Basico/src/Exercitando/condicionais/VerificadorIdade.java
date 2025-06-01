package Exercitando.condicionais;
import java.util.Locale;
import java.util.Scanner;
/**
 * Verificador de Idade: Peça ao usuário para inserir sua idade
 *  e exiba se ele é maior ou menor de idade.
 * 
*/
public class VerificadorIdade {
    public static void main(String[] args) {
        int idade ;
        boolean verificar;
        Scanner idadeUser = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe sua idade");
        idade = idadeUser.nextInt();
        idadeUser.close();

        if (idade >= 18) {
            System.out.println("Voce e maior de idade!");
            verificar = true;
            
        }else{
            System.out.println("Voce e menor de idade!");
            verificar = false;
        }
        
        if (verificar == true ) {
            System.out.println("Parabens voce já pode tirar a carteira categoria A e B");

        }else{
            int anosPendente = 18 - idade ;
            System.out.println("Que pena faltam: "+anosPendente+" para voce poder tirar sua carteira");


        }
    

    }

}
