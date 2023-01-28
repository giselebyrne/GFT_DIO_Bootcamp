package gft_dio_bootcamp;

import org.junit.jupiter.api.*;

//Outra opção de ordenar os testes:
//@TestClassOrder(MethodOrderer.OrderAnnotation.class)
// Antes de Caca @Teste usar -> @Order(1), ou @Order(2) e etc

// Outra opção de Ordenar os Testes:
//@TestClassOrder(MethodOrderer.MethodName.class)
// Executa os testes por ordem alfabetica dos métodos


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTesteJUnit {

    //@DisplayName("Teste que valida se o usuário foi criado")
    @DisplayName("A")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
        System.out.println("Teste1");
    }

   @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
        System.out.println("Teste2");
    }

    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
        System.out.println("Teste3");
    }

    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
        System.out.println("Teste4");
    }
    
}
