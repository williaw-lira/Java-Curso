package Projetos.Battle;
import java.util.Locale;

public class Racas {
    private String nome ;
    private double vida;
    private double forca;
    public int opcaoMagia;


    class Humanos extends Racas {
        double roubo;
        double negociacao;
        
        public Humanos (String nome, double vida, double forca, double roubo, double negociacao){
            this.roubo = roubo;
            this.negociacao = negociacao;


        }
    }

    class Magos extends Racas {
        double mana;
        String magia; 
        


        

        public Magos (String nome, double vida, double forca, double mana, String magia){
            this.mana = mana;
            this.magia = magia;
            
            if(mana < mana || vida < vida){}
                while(mana <= 200 && mana < 10){
                    mana += 0.5;
                }
                while (vida <= 150 ) {
                    vida += 0.1;
                }
            System.out.println("Mago: " + nome + "está com: " + mana + "mana" );
            System.out.println("Mago: " + nome + "está com: " + vida + "vida" );

        }

        public void usarMagia(Racas alvo, int opcaoMagia){
            double forcaMagia;
            double dano ;
            this.opcaoMagia = opcaoMagia;

            

            switch (opcaoMagia) {
                case 1:
                    forcaMagia = 5 ;
                    mana = mana - 15;
                    dano = alvo.vida - forcaMagia;

                    System.out.println("magia basica de: "+ magia);
                    System.out.println("Mago: " + nome + "perdeu: " + mana + " de mana");

                    break;

                case 2:
                    forcaMagia = 8 ;
                    mana = mana - 20;
                    dano = alvo.vida - forcaMagia;

                    System.err.println("O mago: " + nome + " usou Magia de: " + magia + "Nivel I" + " contra :" + alvo.nome + " -" +dano+ " vida" );
                    System.out.println("Mago: " + nome + "perdeu: " + mana + " de mana");
            
                    break;

                case 3:
                    forcaMagia = 12 ;
                    mana = mana - 30;
                    dano = alvo.vida - forcaMagia;

                    System.err.println("O mago: " + nome + " usou Magia de: " + magia + "Nivel II" + " contra :" + alvo.nome + " -" +dano+ " vida" );
                    System.out.println("Mago: " + nome + "perdeu: " + mana + " de mana");

                    break;

                case 4:
                    forcaMagia = 15 ;
                    mana = mana - 35;
                    dano = alvo.vida - forcaMagia;

                    System.err.println("O mago: " + nome + " usou Magia de: " + magia + "Nivel III" + " contra :" + alvo.nome + " -" +dano+ " vida" );
                    System.out.println("Mago: " + nome + "perdeu: " + mana + " de mana");

                    break;

                default:
                    break;
            }




        }

        public void recuperarVida(){
            if(vida < vida & mana > 20){
                mana -= 20; 
            } 
        }
    
    }

}






