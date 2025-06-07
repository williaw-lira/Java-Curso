package ConteudoAula;
// vamos aprender a utilizar o scanner para solicitar dados dos usuarios 
// primeiro importamos a biblioteca do scanner
import java.util.Scanner;
import java.util.Locale;

/**
 *  Essa e uma Classe Scanner para solicitar dados do usuario,
 *  A finalidade do scanner e capturar os dados digitados pelo usuario e converter em parametros
 * @param args o argumento de linha de comando
 * @param scanner objeto scanner criado para solicitar dados do usuario
 * @param next solicita um dado do usuario e armazena na variavel
 * @param nextInt solicita um dado inteiro do usuario e armazena na variavel
 * @param nextDouble solicita um dado double do usuario e armazena na variavel
 * @param System.in solicita um dado do usuario
 * @param useLocale solicita um dado do usuario
 * @param Locale.US solicita um dado do usuario
 */

public class ScannerClasse{
    public static void main(String[] args) {
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

    }

}    

