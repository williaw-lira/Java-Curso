package Exercitando.IFELSE;
import java.util.Locale;
import java.util.Scanner;


/**
 * Senha de Acesso: O usuário insere uma senha. Se for "1234", exibe 
 * "Acesso permitido", senão "Acesso negado".
 */
public class VerificadorSenha {
    public static void main(String[] args) {
        int senha = 1234;
        int senhaUser;
        Scanner senhaTerminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a Senha de Acesso: ");
        senhaUser = senhaTerminal.nextInt();
        senhaTerminal.close();

        if (senha == senhaUser) {
            System.out.println("Senha Correta!");
            
        }else{
            System.out.println("Senha Negada!");
        }
        

    }


}
