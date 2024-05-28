import br.com.dio.desafio.dominium.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso1");
        curso1.setDescricao("CursoJava");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("MentoriaJava");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setDescricao("DecricaoBootcamp1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por Camila: " + devCamila.getConteudosInscritos());
        devCamila.prosseguir();
        devCamila.prosseguir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());




    }
}