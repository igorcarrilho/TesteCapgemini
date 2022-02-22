package br.com.desafio.questao03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao03 {

    public static int anagrama(String palavra){

        List<String> palavraSeparada = new ArrayList<>();
        int contadorAnagramas = 0;

        for (int i = 0; i < palavra.length(); i++) {
            for(int j = i+1; j <= palavra.length(); j++){
                palavraSeparada.add(palavra.substring(i,j));
            }
        }

        for (int i = 0; i < palavraSeparada.size(); i++) {
            for(int j = i+1; j < palavraSeparada.size(); j++){
                String substring1 = ordenaPalavra(palavraSeparada.get(i));
                String substring2 = ordenaPalavra(palavraSeparada.get(j));
                if(substring1.equals(substring2)){
                    contadorAnagramas ++;
                }
            }
        }
        return contadorAnagramas;

    }

    private static String ordenaPalavra(String palavra){
        char[] arrayPalavra = palavra.toCharArray();
        Arrays.sort(arrayPalavra);
        return new String(arrayPalavra);
    }

}
