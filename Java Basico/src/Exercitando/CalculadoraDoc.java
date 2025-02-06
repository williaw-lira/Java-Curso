package Exercitando;

// uso de tags 
/**
    @author william lira
    @since 2025-02-06
    @version 1.0
    @see JavaDocumentado
*/


public class CalculadoraDoc{
    /**
     * Este metodo e utilizado para somar dois numeros inteiros.
     * 
    @param numero1 - primeiro numero inteiro
    @param numero2 - segundo numero inteiro
    @return - retorna a soma dos numeros e
     */

    public int somar(int numero1, int numero2){
        return numero1 + numero2;

    }

    public static void main(String[] args) {
        CalculadoraDoc soma = new CalculadoraDoc();
        System.out.println(soma.somar(1,2));

        
    }
}