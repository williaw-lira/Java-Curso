package Projetos.Battle;

public class Magos extends Racas {
    private double mana;
    private String magia;
    public int opcaoMagia;

    public Magos(String nome, double vida, double forca, double mana, String magia) {
        super(nome, vida, forca);
        this.mana = mana;
        this.magia = magia;

        if (this.mana < 10 || this.getVida() < 50) {
            while (this.mana < 10 && this.mana <= 200) {
                this.mana += 0.5;
            }
            while (this.getVida() < 150) {
                this.setVida(this.getVida() + 0.1);
            }
        }
        System.out.println("Mago: " + getNome() + " está com: " + this.mana + " mana");
        System.out.println("Mago: " + getNome() + " está com: " + getVida() + " vida");
    }

    public void usarMagia(Racas alvo, int opcaoMagia) {
        double forcaMagia = 0; // Inicialize com 0
        this.opcaoMagia = opcaoMagia;

        switch (opcaoMagia) {
            case 1:
                forcaMagia = 5;
                this.mana -= 15;
                System.out.println("Magia basica de: " + this.magia);
                System.out.println("Mago: " + getNome() + " perdeu: " + this.mana + " de mana");
                break;
            case 2:
                forcaMagia = 8;
                this.mana -= 20;
                System.out.println("O mago: " + getNome() + " usou Magia de: " + this.magia + " Nivel I");
                System.out.println("Mago: " + getNome() + " perdeu: " + this.mana + " de mana");
                break;
            case 3:
                forcaMagia = 12;
                this.mana -= 30;
                System.out.println("O mago: " + getNome() + " usou Magia de: " + this.magia + " Nivel II");
                System.out.println("Mago: " + getNome() + " perdeu: " + this.mana + " de mana");
                break;
            case 4:
                forcaMagia = 15;
                this.mana -= 35;
                System.out.println("O mago: " + getNome() + " usou Magia de: " + this.magia + " Nivel III");
                System.out.println("Mago: " + getNome() + " perdeu: " + this.mana + " de mana");
                break;
            case 5:
                this.mana -= 20;
                recuperarVida();
                System.out.println("O mago: " + getNome() + " usou Magia de cura. " + getVida() + " de vida adquirido");
                System.out.println("Mago: " + getNome() + " perdeu: " + mana + " de mana");
                return;
            default:
                System.out.println("Opcao de magia invalida.");
                return; 
        }

        alvo.sofrerDano(forcaMagia);
    }

    public void recuperarVida() {
        if (this.getVida() < 100 && this.mana >= 20) {
            this.mana -= 20;
            this.setVida(this.getVida() + 20);
        } else {
            System.out.println("Mana insuficiente ou vida ja no maximo.");
        }
    }
}