package gft_dio_bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisJUnit{

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste2");
    }

    @Test
    @EnabledForJreRange(min = JAVA_8, max = JAVA_17)
    void validarAlgoSomenteNoJreRange(){
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste3");
    }

    @Test
    @EnabledOnJre(JAVA_17)
    void validarAlgoSomenteNoJre(){
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste4");
    }
    
}
