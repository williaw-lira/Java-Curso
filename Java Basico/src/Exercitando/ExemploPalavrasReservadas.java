package Exercitando;

import java.util.ArrayList;
import java.util.List;

public class ExemploPalavrasReservadas {

    // Modificador de acesso: private
    private List<String> lista;

    // Construtor
    public ExemploPalavrasReservadas() {
        // Uso do operador new para instanciar
        lista = new ArrayList<>();
    }

    // Método público com retorno void e parâmetro
    public void adicionarItem(String item) {
        if (item != null) { // Controle de fluxo: if
            lista.add(item);
        } else {
            // Controle de fluxo: else
            System.out.println("Item não pode ser nulo.");
        }
    }

    // Método que demonstra tratamento de exceção
    public String obterItem(int indice) {
        try { // Bloco try para exceções
            return lista.get(indice);
        } catch (IndexOutOfBoundsException e) { // Bloco catch para tratar a exceção
            return "Índice inválido!";
        } finally { // Bloco finally que sempre é executado
            System.out.println("Tentativa de acesso ao item.");
        }
    }

    // Método principal: ponto de entrada
    public static void main(String[] args) {
        ExemploPalavrasReservadas exemplo = new ExemploPalavrasReservadas();
        exemplo.adicionarItem("Java");
        System.out.println(exemplo.obterItem(0));
    }
}
