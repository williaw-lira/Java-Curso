package ConteudoAula;
//Assuntos:

// tipos primitivos
// classificações
// escopo de uso
// palavra "opostas"
// contem 52 palavras reservadas

// PALAVRAS "OPOSTAS"
// CONTROLE DE PACOTES
// MODIFICADORES DE ACESSO
// PRIMITIVOS
// MODIFICADORES DE CLASSES VARIÁVEIS E METODOS
// CONTROLADORES DE FLUXO

// 1 Controle de Pacotes -->
//package com.exemplo.meuprojeto;
//import java.util.List;




public class PalavrasReservadas {
    public static void main(String[] args) {
//uso
    int numero = 10;
    System.out.println("Numero: " + numero);
    } 


// arquivos
// classes
// metodos
// atributos


// 2 Controle de Exceções
public void metodoComExcecao() {
    // divisão por zero e uma exceção aritmética
    // usamos o bloco try catch para tratar a exceção e finaly para executar um bloco de código
    try {
        int resultado = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    } finally {
        System.out.println("Bloco finally executado.");
    }
}


// 3 Controle de Fluxo
public void exemploFluxo(int numero){
    
    int resto = numero % 2;
    // verificador de codigo mas quando o numero for impar ele imcrementa mais 1 para ser par.
    
    if (resto == 0){
        System.out.println("Numero: " + numero + " e Par!");
    } else {
        System.out.println("Numero: " + numero + " e Impar!");
        numero++;
    }
    
}    
}

