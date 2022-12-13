package gft_dio_bootcamp;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AssertionsJUnit {

    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        
       Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

        // Outra forma de Fazer comparação
        assertNotEquals(primeiroLancamento, segundoLancamento);        
    }
   
    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        assertNotNull(joao);
    }

    @Test
    void validarNumeroDeTiposDiferentes(){
        double valor1 = 5d;
        double valor2 = 5d;

        Assertions.assertEquals(valor1, valor2);
    }
    
}
