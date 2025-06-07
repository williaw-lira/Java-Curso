// For em Arrays
package ConteudoAula;
public class ForArrays {
    public static void main(String [] args){
        // Array de inteiros
        int [] numeros = {1,2,3,5,5,6,5,8,9,10};
    
        for(int i = 0; i < numeros.length ;i++ ){
            System.out.println(numeros[i]);
        }

        // Array de Strings

        String [] nomes = {"william", "vito", "joao"};
        for (int x = 0; x < nomes.length; x++){
            System.out.println(nomes[x]);
            if (nomes[x].equals("vitor")) {
                System.out.println("Achei o Vitor");
            }
        }
    }
}