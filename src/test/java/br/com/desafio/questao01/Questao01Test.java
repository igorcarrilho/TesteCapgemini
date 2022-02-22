package br.com.desafio.questao01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Questao01Test {

    private Questao01 questao01 = new Questao01();

    @Test
    public void deveRetornarEscada() {

        int degraus = 6;
        String[] escadaEsperada = new String[degraus];
        escadaEsperada[0] = "     *";
        escadaEsperada[1] = "    **";
        escadaEsperada[2] = "   ***";
        escadaEsperada[3] = "  ****";
        escadaEsperada[4] = " *****";
        escadaEsperada[5] = "******";

        String[] resultado = questao01.geraEscada(degraus);

        Assertions.assertArrayEquals(escadaEsperada, resultado);
    }
}