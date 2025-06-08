// Conteúdo da classe Racas
package Projetos.Battle;

public class Racas {
    private String nome;
    private double vida;
    private double forca;

    public Racas(String nome, double vida, double forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    // Métodos getters para acessar os atributos (importante para subclasses e Main)
    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public double getForca() {
        return forca;
    }

    // Setters se você precisar modificar vida ou forca
    public void setVida(double vida) {
        this.vida = vida;
    }

    public void sofrerDano(double dano) {
        if (dano > 0) { 

            this.vida -= dano; // Reduz a vida
                if (this.vida < 0) {
                    this.vida = 0; // Impede que a vida fique negativa
                }

            System.out.println(this.getNome() + " sofreu " + dano + " de dano. Vida atual: " + this.vida);

        } else {

        System.out.println(this.getNome() + ": Nao houve dano.");
        }
    }


}





