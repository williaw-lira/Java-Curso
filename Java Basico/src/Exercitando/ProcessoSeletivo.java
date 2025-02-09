package Exercitando;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    
        System.out.println("Processo Seletivo");

        double salarioBase = 2000.0; 

        analisarCandidato(salarioBase);
        selecaoCandidatos(salarioBase); 
    }

    static void selecaoCandidatos(double salarioBase){
        // 1 - criando candidatos 
        String[] candidatos = {"Ana", "Paulo", "Miguel", "Julia", "Vitoria", "Guilherme", "Henrique", "Augusto", "Joana"}; 
    
        int candidatoSelecionados = 0; // 2 - selecionando candidatos apartir do salario
        int candidatoAtual = 0;

        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " solicitou esse valor: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatoSelecionados++;

            }else {

                System.out.println("O candidato " + candidato + " NAO foi selecionado!");
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido(){

        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioBase){

        double salarioPretendido = valorPretendido();

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contra proposta");

        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
