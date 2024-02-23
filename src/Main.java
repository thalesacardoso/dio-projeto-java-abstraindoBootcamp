import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // -------------   Criação dos Cursos  ------------
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(20);

        // -------------   Criação das Mentorias  ------------
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        // -------------   Criação dos Bootcamps  ------------
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição do bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // -------------   Criação dos Devs  ------------
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("------------------- " + devMaria.getNome() + " -------------------");
        System.out.println("Cursos matriculados:" + devMaria.getConteudosInscritos());
        System.out.println("Cursos Concluidos:" + devMaria.getConteudosConcluidos());
        System.out.println("XP total:" + devMaria.calcularTotalXp());
        System.out.println("----------------------------------------------- \n");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        devMarcos.progredir();
        devMarcos.progredir();

        System.out.println("------------------- " + devMarcos.getNome() + " -------------------");
        System.out.println("Cursos matriculados:" + devMarcos.getConteudosInscritos());
        System.out.println("Cursos Concluidos:" + devMarcos.getConteudosConcluidos());
        System.out.println("XP total:" + devMarcos.calcularTotalXp());
        System.out.println("-----------------------------------------------");

    }
}