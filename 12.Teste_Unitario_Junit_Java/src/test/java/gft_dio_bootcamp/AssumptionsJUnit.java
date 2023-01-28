package gft_dio_bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Assertions;



public class AssumptionsJUnit {

    @Test
    void validarAlgoSomenteNoUsuarioGisele(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste1");
    }

    @Test
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste2");
    }

    @Test
    void validarAlgoSomenteNoUsuarioJoao(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste3");
    }
    
    
}
