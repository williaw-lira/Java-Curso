// Main.java
package Projetos.Battle;

public class Main {
    public static void main(String[] args) {
        
        Magos william = new Magos("William", 300, 20, 200, "Fogo");
        Humanos joao = new Humanos("João", 250, 15, 5, 10);

        System.out.println("\n--- Antes da Magia ---");
        System.out.println("Vida de João: " + joao.getVida());

        // William usa magia contra João
        william.usarMagia(joao, 2); // Magia Nivel I (dano de 8)

        System.out.println("\n--- Depois da Magia ---");
        System.out.println("Vida de João: " + joao.getVida());

        // Testar mais dano
        william.usarMagia(joao, 4); // Magia Nivel III (dano de 15)
        System.out.println("Vida de João: " + joao.getVida());
    }
}