// Para que seja realizado a documentação 
// deve se utilizar as tags e /** */ para que seja feito a documentação

// Exemplo de documentação

/**
 * Este é um exemplo de documentação
 * onde vamos fazer a documentação de uma classe
 * 
 * @author william lira
 * @since 2025-02-06
 * @version 1.0
 * @see Exercitando.CalculadoraDoc
 */
// o see e utilizado para referenciar outra classe


public class JavaDocumentado {
        // Metodo principal
        // Metodo arqumentos a serem passados ou arquivo principal
    
    // metodo principal 
    // vamos fazer a documentação de um metodo utilizando as tags

    /**
     * Este metodo e utilizado para retornar se o numero e par ou impar
     * @param numero - numero inteiro 
     * @return - retorna uma string com a informação se o numero e par ou impar
     */
    
    public String verificadorParImpar(int numero){
        if (numero % 2 == 0){
            return "O Numero: "+numero+" e par";
        }else{
            return "O Numero: "+numero+" e impar";
        }

        // percebe-se que por não ser public "static" o main não o reconhece e precisa ser instanciado 
        // utilizando o new para ser chamado como objeto
    }  
    
    /**
     * Metodo principal para executar a classe
     * @param args - argumentos passados por linha de comando
     */

    public static void main(String[] args) {
        // Metodo arqumentos a serem passados ou arquivo principal
        JavaDocumentado javaDocumentado = new JavaDocumentado();
        System.out.println(javaDocumentado.verificadorParImpar(11));

        somaInteiros(1, 2);

}
    // exemplo de documentação de metodo com o static e sem retorno
    /**
     * Este metodo e utilizado para imprimir a soma de dois numeros inteiros
     * @param a - primeiro numero inteiro
     * @param b - segundo numero inteiro
     */
    public static void somaInteiros(int a, int b){
        System.out.println(a + b);
    }
}