import java.util.Scanner;

import java.util.Locale;

/*
 * TryCatch
 * e utilizado para tratar excecoes
 */


/**
 * 
 * @author WILLIAM LIRA
 * @since 07/02/2025    
 * @version 1.0
 * 
 * @param args - argumento de linha de comando
 * @param System.in - solicita um dado do usuario
 * @param System.out - imprime um dado na tela
 * @param Locale - classe que formata os dados do usuario
 * @param String - classe que le dados do usuario
 * @param int - classe que le dados do usuario
 * @param double - classe que le dados do usuario
 * @param IndexOutOfBoundsException - excecao que trata erros de execucao
 * @param Scanner - classe que le dados do usuario
 * @param try - bloco de codigo que pode gerar excecoes
 * @param catch - bloco de codigo que trata a excecao
 * @param finally - bloco de codigo que sempre sera executado   
 */
public class TryCatch {
    public static void main(String[] args) {
        try{
        // 1 - criamos um objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;

        // 2 - solicitamos um dado ao usuario
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();


        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        // 3 - imprimimos os dados do usuario

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        //possiveis erros de execucao do programa sao tratados no bloco try catch
        
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("Erro ao ler os dados");
    }
    finally{
        System.out.println("Fim do programa");    
    }   
    }   
}

