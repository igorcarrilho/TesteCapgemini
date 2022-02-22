package br.com.desafio.questao02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Questao02Test {

    private Questao02 questao02 = new Questao02();

    @Test
    public void deveRetornarZeroQuandoASenhaForForte(){
        String senha = "Aa3*aa";

        int resultado = questao02.calculaCaractereParaSenhaForte(senha);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void deveRetornarUmQuandoSomenteARegraDeCaracterEspecialNaoForAtendida(){
        String senha = "Aa3aaa";

        int resultado = questao02.calculaCaractereParaSenhaForte(senha);

        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void deveRetornarTresQuandoTresRegrasNaoForAtendida(){
        String senha = "aaaaaa";

        int resultado = questao02.calculaCaractereParaSenhaForte(senha);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveRetornarTresQuandoFaltarTresCaracteresEDuasRegras(){
        String senha = "Ya3";

        int resultado = questao02.calculaCaractereParaSenhaForte(senha);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveRetornarUmQuandoFaltarSomenteLetraMaiuscula(){
        String senha = "a3*aaa";

        int resultado = questao02.calculaCaractereParaSenhaForte(senha);

        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void deveRetornarExceptionQuandoASenhaForNulaOuVazia(){
        String senha = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            questao02.calculaCaractereParaSenhaForte(senha);
        });

        Assertions.assertEquals("Senha nao pode ser Nula ou Vazia", exception.getMessage());
    }


}
