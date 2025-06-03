/**
 *      Laço For
 *  @author william lira
 *  @since 07/02/2025
 *  
 *  exercicio de laço for
 *  Crie um programa que peça ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

import java.util.Scanner;

public class LaçoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para que deseja ver a tabuada: ");
        int numero = scanner.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }
        
    }
    
}
