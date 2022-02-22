package br.com.desafio.questao02;

import java.util.Arrays;
import java.util.List;

public class Questao02 {

    public static int calculaCaractereParaSenhaForte(String senha){

        if(senha == null || senha.isEmpty()){
            throw new IllegalArgumentException("Senha nao pode ser Nula ou Vazia");
        }
        int somaRegrasFaltantes = 0;
        int tamanhoMinimo = verificaSizeSenha(senha);
        somaRegrasFaltantes += verificaNumero(senha);
        somaRegrasFaltantes += verificaMinuscula(senha);
        somaRegrasFaltantes += verificaMaiuscula(senha);
        somaRegrasFaltantes += verificaCaractereSpecial(senha);

        if(somaRegrasFaltantes > tamanhoMinimo){
            return somaRegrasFaltantes;
        }
        return tamanhoMinimo;
    }
    private static int verificaSizeSenha(String senha){
        final int minimoCaractere = 6;
        int restanteSenha = minimoCaractere - senha.length();
        if (restanteSenha <=0 ){
            return 0;
        }
        return restanteSenha;
    }
    private static int verificaMinuscula(String senha) {
        final String regexLetraMinuscula = ".*[a-z].*";
        if (senha.matches(regexLetraMinuscula)) {
            return 0;
        }
        return 1;
    }

    private static int verificaMaiuscula(String senha) {
        final String regexLetraMaiuscula = ".*[A-Z].*";
        if (senha.matches(regexLetraMaiuscula)) {
            return 0;
        }
        return 1;
    }

    private static int verificaNumero(String senha) {
        final String regexNumero = ".*\\d.*";
        if (senha.matches(regexNumero)) {
            return 0;
        }
        return 1;
    }

    private static int verificaCaractereSpecial(String senha) {
        final List<String> regexCaractereSpecial = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+");
        for (String caractere : regexCaractereSpecial) {
            if (senha.contains(caractere)) {
                return 0;
            }
        }
        return 1;
    }

}
