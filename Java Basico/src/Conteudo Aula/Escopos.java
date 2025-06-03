//escopo de variáveis em java pode ser global ou local
//variáveis globais são acessíveis em qualquer parte do código
//variáveis locais são acessíveis apenas dentro de um bloco de código
//variáveis locais são declaradas dentro de um bloco de código
//variáveis globais são declaradas fora de um bloco de código
//variáveis locais podem ter o mesmo nome de variáveis globais
//variáveis locais tem prioridade sobre variáveis globais
//variáveis locais são destruídas após a execução do bloco de código

//passo 1 - exemplo de variável global
public class Escopos {
    
    public static void main(String[] args) {
        int a = 10; // variavel global 
        System.out.println("Variavel global: " +a);

        // passo 2 - acessar variavel local
        // variavel b não é acessível fora do bloco de código apenas dentro do bloco de código main
        variavelLocalExemplo(); // 2 - exemplo de variável local
        somaVariavelLocal(); // 1-  Exemplo de variável local com mesmo nome de variável global

        // passo 3 - acessar variavel local no bloco main
        System.out.println("exemplo 3 ->> ");
        novoMetodo(); // 3 - exemplo de variável local com mesmo nome de variável global

    }
    
    //1 - exemplo de variável local
    public static void variavelLocalExemplo() {
        int b = 20; // variavel local
        System.out.println("Variavel local: " + b);    
        System.out.println(" " );
    }


    // veja que so imprime o 10!
    // variavel b não é acessível fora do bloco de código
    // variavel a é acessível em qualquer parte do código
    // variavel b é destruída após a execução do bloco de código
    
    // 1-  Exemplo de variável local com mesmo nome de variável global
    public static void somaVariavelLocal() {
        System.out.println("exemplo 2 ->> ");
        variavelLocalExemplo();
        // soma de local com outra local 

        int b = 1; // variavel local
        int a = 10; // variavel local
        int soma = b + a; // variavel local + variavel local
        System.out.println("Soma de variavel local com variavel global: " + soma);
        System.out.println(" " );
    }

    public static void novoMetodo() {
        // criando uma variavel que não esxiste
        String nome = "jorge";
        int idade = 20;
        System.out.println("Nome: " + nome + " Idade: " + idade);
    }

}
