package br.com.desafio.questao02;

import java.util.Scanner;

public class Questao02Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite Sua Senha: ");
        String senha = sc.next();

        Questao02 questao02 = new Questao02();
        System.out.println(questao02.calculaCaractereParaSenhaForte(senha));
    }
}
