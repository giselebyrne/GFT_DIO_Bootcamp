import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGisele = new Dev();
        devGisele.setNome("Gisele Byrne");
        devGisele.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gisele: " + devGisele.getConteudosInscritos());

        devGisele.progredir();
        System.out.println("-----");

        System.out.println("Contudos Inscritos Gisele: " + devGisele.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gisele: " + devGisele.getConteudosConcluidos());

        System.out.println("Total XP Gisele: " + devGisele.calcularTotalXp());

        System.out.println("--------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Cardoso");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-----");

        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());

        System.out.println("Total XP Joao: " + devJoao.calcularTotalXp());

        // Polimorfismo - Tudo que tem em Conteudo tem em Curso. Mas nem tudo que tem em Curso tem em Conteudo
        // É possivel pq Conteudo é mãe de Curso
        // Exemplo de Polimorfismo: Conteudo conteudo = new Curso();
        
    }
    
}
