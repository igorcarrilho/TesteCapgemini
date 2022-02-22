package br.com.desafio.questao03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao03Test {

    Questao03 questao03 = new Questao03();

    @Test
    public void deveRetornarDoisAnagramasParaAPalavraOvo(){
        String palavra = "ovo";

        int resultado = questao03.anagrama(palavra);

        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void deveRetornarTresAnagramasParaaPalavraIfailuhkqq(){
        String palavra = "ifailuhkqq";

        int resultado = questao03.anagrama(palavra);

        Assertions.assertEquals(3, resultado);
    }


}
