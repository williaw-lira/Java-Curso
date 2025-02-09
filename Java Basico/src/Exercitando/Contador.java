package Exercitando;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parametro: ");
            int parametroUm = lerParametro(terminal);

            System.out.println("Digite o segundo parametro: ");
            int parametroDois = lerParametro(terminal);

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.err.println("Por favor, insira um número inteiro válido.");

        } finally {
            terminal.close();
        }
    }

    private static int lerParametro(Scanner terminal) {
        while (true) {
            try {
                return terminal.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor, insira um número inteiro:");
                terminal.next();
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }
}

class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
