
public class ControlesFluxo {
    public static void main(String[] args) {
        double saldo = 1000;
        double valorSolicitado = 48;

        if(valorSolicitado<=saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque Realizado com Sucesso!");
            System.out.println("Saldo Atual: " + saldo);
        }else{
            System.out.println("Saldo Insuficiente!");
        }

        // Condicional Ternário
        String resultado = valorSolicitado<=saldo ? "saque ralizado com sucesso": "saldo insuficiente";

        System.out.println(resultado);

        // Switch case

        int dia = 8;

        String diaDaSemana = "";

        switch(dia){
            case 1:
                diaDaSemana = "Domingo";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 2:
                diaDaSemana = "Segunda";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 3:
                diaDaSemana = "Terça";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 4:
                diaDaSemana = "Quarta";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 5:
                diaDaSemana = "Quinta";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 6:
                diaDaSemana = "Sexta";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            case 7:
                diaDaSemana = "Sábado";
                System.out.println("O dia da semana é: " + diaDaSemana);
                break;
            default:
                diaDaSemana = "inválido";
                System.out.println("O dia da semana está  " + diaDaSemana);
                break;

        
        }
    }
}