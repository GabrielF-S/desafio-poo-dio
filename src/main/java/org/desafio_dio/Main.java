package org.desafio_dio;

import org.desafio_dio.domain.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria javascript");
        mentoria2.setDescricao("Descricao mentoria javascript");
        mentoria2.setData(LocalDate.now().plusDays(1L));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);


        Dev devGabs = new Dev();
        devGabs.setNome("Gabriel");
        devGabs.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devGabs.getConteudosInscritos());
        System.out.println("*****".repeat(5));
        devGabs.progredir();
        System.out.println("Conteudos inscritos: " + devGabs.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devGabs.getConteudosConcluidos());
        System.out.println( "XP adquirido: " + devGabs.calcularTotalXP());

        System.out.println("*****".repeat(10));

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("*****".repeat(5));
        System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println( "XP adquirido: " + devCamila.calcularTotalXP());



    }
}