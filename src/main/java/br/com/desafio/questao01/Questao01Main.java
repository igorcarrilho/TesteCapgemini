package br.com.desafio.questao01;

import java.util.Scanner;

public class Questao01Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos degrais vão ter sua escada: ");
        int qtdDegraus = sc.nextInt();

        Questao01 escada = new Questao01();
        escada.geraEscada(qtdDegraus);

    }
}