package Treino;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		preencheProfessor();
		preencheDisciplina();
	}
	
	public void preencheCurso() {
	Scanner entrada = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		System.out.println("Informe o nome do Curso: ");
		String nomeCurso = entrada.nextLine();
		curso.setNome(nomeCurso);
		
		System.out.println("Informe a quantidade de períodos: ");
		String qtdPeriodos = entrada.nextLine();
		int quantidadePeriodos = Integer.parseInt(qtdPeriodos);
		curso.setQuantidadePeriodos(quantidadePeriodos);
		
		System.out.println("Informe o grau academico: ");
		String grauAcademico = entrada.nextLine();
		curso.setGrauAcademico(grauAcademico);
		
		System.out.println("Informe as disciplinas:");
		String disciplinas = entrada.nextLine();
		curso.setDisciplinas(disciplinas);
	}
	
	public static void preencheDisciplina() {
		Scanner entrada = new Scanner(System.in);
		
		Disciplina disciplina = new Disciplina();
		
		System.out.println("Informe o nome da disciplina: ");
		String nomeDisciplina  = entrada.nextLine();
		disciplina.setNome(nomeDisciplina);
		
		System.out.println("Informe a quantidade de horas  da disciplina: ");
		String h  = entrada.nextLine();
		int horas = Integer.parseInt(h);
		disciplina.setCargaHoraria(horas);
	
		System.out.println("Informe o resumo:");
		String resumo = entrada.nextLine();
		disciplina.setResumo(resumo);
		
	}
	
	public static void preencheProfessor() {
		Scanner entrada = new Scanner(System.in);
		
		Professor professor = new Professor();
		
		System.out.println("Informe o nome do professor: ");
		String nomeProfessor  = entrada.nextLine();
		professor.setNome(nomeProfessor);
		
		System.out.println("Informe a quantidade de horas semanais: ");
		String horasS  = entrada.nextLine();
		int horasSemanais = Integer.parseInt(horasS);
		professor.setQuantidadeHorasSemanais(horasSemanais);
	
		System.out.println("Informe o nivel de formação:");
		String nivelFormacao = entrada.nextLine();
		professor.setNivelFormação(nivelFormacao);
	}
	
	public static void preencheSala() {
		Scanner entrada = new Scanner(System.in);
		
		Sala sala = new Sala();
		
		System.out.println("Informe o nome da sala: ");
		String nome = entrada.nextLine();
		sala.setNome(nome);
		
		System.out.println("Informe o bloco: ");
		String bloco = entrada.nextLine();
		sala.setBloco(bloco);
		
		System.out.println("Informe o tipo: ");
		String tipo = entrada.nextLine();
		sala.setTipo(tipo);		
	}
}
