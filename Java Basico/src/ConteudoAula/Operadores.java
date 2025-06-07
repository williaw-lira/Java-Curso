package ConteudoAula;
public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        System.out.println("Operadores aritmeticos -->");
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int resto = 10 % 5;
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);

        // Operadores de comparação
        System.out.println("Operadores de comparacao -->");
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMaiorIgualVinte = 10 >= 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        boolean dezIgualVinte = 10 == 20;
        boolean dezDiferenteVinte = 10 != 20;
        System.out.println("Dez e maior que vinte? " + dezMaiorQueVinte);
        System.out.println("Dez e maior ou igual a vinte? " + dezMaiorIgualVinte);
        System.out.println("Dez e menor que vinte? " + dezMenorQueVinte);
        System.out.println("Dez e menor ou igual a vinte? " + dezMenorIgualVinte);
        System.out.println("Dez e igual a vinte? " + dezIgualVinte);
        System.out.println("Dez e diferente de vinte? " + dezDiferenteVinte);

        // Operadores lógicos
        System.out.println("Operadores logicos -->");
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso); // E
        System.out.println(verdadeiro || falso); // OU
        System.out.println(verdadeiro ^ falso); // OU exclusivo
        System.out.println(!verdadeiro); // Negação

        System.out.println("Operadores unarios -->");
        // Operadores unários
        int numero = 10;
        numero++;
        // numero = numero + 1

        int numero2 = 10;
        numero2--;
        // numero2 = numero2 - 1

        // Pré-incremento
        numero*=2;
        // numero = numero * 2

        System.out.println(numero);
        System.out.println(numero2);
    }


}
