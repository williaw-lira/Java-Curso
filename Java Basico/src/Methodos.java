public class Methodos {

public static void main(String[] args) {
    // Methodo arqumentos a serem passados ou arquivo principal

}
    // Methodos com retorno
    public static int Soma(int a, int b) {
        return a + b;
    }
    // Methodos sem retorno
    public static void ImprimeSoma(int a, int b) {
        System.out.println(a + b);
    }

    // Methodos privados
    private static void MetodoPrivado() {
        System.out.println("Metodo privado");
    }
    
    //methodos protegidos
    protected static void MetodoProtegido() {
        System.out.println("Metodo protegido");
    }

    // Methodos com parametros variaveis
    public static void ParametrosVariaveis(int... numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    // Methodos com retorno de array
    public static int[] RetornaArray() {
        int[] array = {1, 2, 3, 4, 5};
        return array;
    }

}
