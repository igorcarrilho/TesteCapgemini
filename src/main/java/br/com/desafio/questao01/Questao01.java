package br.com.desafio.questao01;

public class Questao01 {

    public String[] geraEscada(int qtdDegraus){

        String[] degraus= new String[qtdDegraus];

        for (int i = 0; i < qtdDegraus; i++){
            degraus[i] = " ".repeat(qtdDegraus -i -1) + "*".repeat(i+1);
            System.out.println(degraus[i]);
        }

        return degraus;
    }
}