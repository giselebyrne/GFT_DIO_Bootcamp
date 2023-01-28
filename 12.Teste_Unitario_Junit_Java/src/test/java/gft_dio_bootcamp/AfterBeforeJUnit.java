package gft_dio_bootcamp;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfterBeforeJUnit {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("Acessou o Banco de Dados");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Gisele", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Gisele", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));

    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();  
    }
    
}
