package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    // Implementamos o HashSet pq queremos q os conteudos sejam armazenados na medida que forem inscritos ou concluidos
    // O HashSet tb foi escolhido pq o dev só pode se inscrever em um curso ou mentoria. Aplicavel para Concluídos tb.
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        // Quando um deve se inscreve a aplicação vai inserir todo o conteúdo do Bootcamp
        // na variavel 'conteudoInscritos' da Classe Dev
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Quando um Dev se inscreve ele é add na variavel DevInscritos da Classe Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());            
        } else {
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXp(){
        // Esse método pega o XP de cada conteúdo concluido, faz a soma e returna a soma total
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(nome, dev.nome) 
        && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
        && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

}
