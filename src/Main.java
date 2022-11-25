import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso de Programação Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Curso de Programação JavaScript");
		curso2.setCargaHoraria(10);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria do Curso Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devWanderson = new Dev();
		devWanderson.setNome("Wanderson");
		
		devWanderson.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Wanderson: " + devWanderson.getConteudosInscritos());

		devWanderson.progredir();
		devWanderson.progredir();
		System.out.println("Conteudos inscritos Wanderson: " + devWanderson.getConteudosInscritos());
		System.out.println("Conteudos concluídos de Wanderson: " + devWanderson.getConteudosConcluidos());
		System.out.println("XP: " + devWanderson.calcularTotalXp());

		System.out.println();
		System.out.println("------------------------------------------------------");

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		System.out.println("Conteudos inscritos Wanderson: " + devWanderson.getConteudosInscritos());
		System.out.println("Conteudos concluídos de Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
	}

}
