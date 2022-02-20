import ao.com.dio.desafio.dominio.Bootcamp;
import ao.com.dio.desafio.dominio.Curso;
import ao.com.dio.desafio.dominio.Devs;
import ao.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setDescricao("Muito de ter, Curso da digital inovation");
        curso1.setTitulo("Abstração POO");
        curso1.setCargaHoraria(4);

            Curso curso2 = new Curso();
            curso2.setDescricao("Descrição curso Java");
            curso2.setTitulo("POO.DIO");
            curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Muito Bom");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer Bootcamp");
        bootcamp.setDescricao("Aprenda a desenvolver Javas na integra");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Devs devJofre = new Devs();
        devJofre.setNome("Jofre");
        devJofre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devJofre.getConteudosInscritos());
        devJofre.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: "+devJofre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJofre.getConteudosConcluidos());

        System.out.println("-----------------");
        Devs devFranklim = new Devs();
        devFranklim.setNome("Franklim");
        devFranklim.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devFranklim.getConteudosInscritos());
        System.out.println("Conteudos inscritos: "+devFranklim.getConteudosInscritos() );
        devFranklim.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos: "+devFranklim.getConteudosConcluidos());

    }
}
