package gft_dio_bootcamp;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa woman = new Pessoa("Gisele Byrne", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(22, woman.getIdade());
    }

    @Test
    public void  deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Byrne", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
