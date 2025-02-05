public class Condicoes {
    public static void main (String[] args){
        String nome = "william";
        int idade = 20;
        VerificadorIdade(nome, idade);

    }
public static void VerificadorIdade (String nome, int idade){
    if (idade >= 18){
        System.out.println("Maior de idade");
    } else {
        System.out.println("Menor de idade");
    }
}
}
