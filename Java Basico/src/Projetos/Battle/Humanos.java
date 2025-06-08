package Projetos.Battle;

public class Humanos extends Racas {
    private double roubo;
    private double negociacao;

    public Humanos(String nome, double vida, double forca, double roubo, double negociacao) {
        super(nome, vida, forca);
        this.roubo = roubo;
        this.negociacao = negociacao;
        

    }

        @Override
    public void sofrerDano(double dano) {
        //Humanos tem uma chance de desviar de 10% do dano
        if (Math.random() < 0.1) { // 10% de chance de desviar
            System.out.println(this.getNome() + " desviou parcialmente do ataque!");
            super.sofrerDano(dano * 0.9); // Sofre apenas 90% do dano
        } else {
            super.sofrerDano(dano); // Chama o método da classe pai para aplicar o dano normal
        }
    }

}