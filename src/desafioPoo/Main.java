package desafioPoo;

import java.time.LocalDate;

import desafioPoo.dominio.Bootcamp;
import desafioPoo.dominio.Curso;
import desafioPoo.dominio.Dev;
import desafioPoo.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java2");
		curso2.setDescricao("Descrição curso Java2");
		curso2.setCargaHoraria(8);
				
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devFulano = new Dev();
		devFulano.setNome("Fulano");
		devFulano.inscreverBootcamp(bootcamp);
		System.out.println("Coteúdos inscritos Fulano: " + devFulano.getConteudosInscritos());
		devFulano.progredir();
		devFulano.progredir();
		System.out.println("Coteúdos inscritos Fulano: " + devFulano.getConteudosInscritos());
		System.out.println("Coteúdos concluido Fulano: " + devFulano.getConteudosConcluidos());
		System.out.println("XP: " + devFulano.calcularTotalXp());
		System.out.println("------");
		
		Dev devBeltrano = new Dev();
		devBeltrano.setNome("Beltrano");
		devBeltrano.inscreverBootcamp(bootcamp);
		System.out.println("Coteúdos inscritos Beltrano: " + devBeltrano.getConteudosInscritos());
		devBeltrano.progredir();
		devBeltrano.progredir();
		devBeltrano.progredir();
		System.out.println("Coteúdos inscritos Beltrano: " + devBeltrano.getConteudosInscritos());
		System.out.println("Coteúdos concluidos Beltrano: " + devBeltrano.getConteudosConcluidos());
		System.out.println("XP: " + devBeltrano.calcularTotalXp());
		
	}
}
