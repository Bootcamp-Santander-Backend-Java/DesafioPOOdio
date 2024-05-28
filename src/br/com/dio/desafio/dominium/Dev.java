package br.com.dio.desafio.dominium;

import java.util.*;


public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp ){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void prosseguir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.out.println("VOCÊ NÃO ESTÁ MATRICULADO EM NENHUM CONTEUDO");
        }
    }

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = (Iterator<Conteudo>) this.conteudosConcluidos;
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Dev)) return false;
        if (!super.equals(object)) return false;
        Dev dev = (Dev) object;
        return java.util.Objects.equals(getNome(), dev.getNome()) && java.util.Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && java.util.Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}
