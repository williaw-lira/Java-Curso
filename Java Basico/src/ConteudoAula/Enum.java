package ConteudoAula;

public class Enum {
    public enum EstadoBrasileiro{
        SAO_PAULO ("SP", "São Paulo"),
        RIO_JANEIRO("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí");

        private String nome;
        private String sigla;

        private EstadoBrasileiro (String sigla, String nome){
            this.sigla = sigla;
            this.nome = nome ;
        }

        public String getSigla(){
            return sigla;
        }

    }
    
}
