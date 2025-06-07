package ConteudoAula;
public class PooStudent {

    public static void main(String[] args) {
        
        estudante aluno1 = new estudante();
        aluno1.name = "wilson";
        aluno1.idade = 15;
        aluno1.sexo = "Masculino";
        

        estudante aluno2 = new estudante();
        aluno2.name = "junior";
        aluno2.idade = 14;
        aluno2.sexo = "Masculino";

        System.err.println(aluno1.name);
        System.err.println(aluno1.idade);
        System.err.println(aluno1.sexo);
        aluno1.bebida(null);

        



    }
}
        class estudante {
            String name;
            int idade;
            String sexo;

            void falar(){
            }
            void comer(String comida ){
            }
            void bebida(String bebida){
                String Bebida = "Suco";
                System.out.println(Bebida);

                
            }
            void correr(){
            }

        }