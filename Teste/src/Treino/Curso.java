package Treino;

import java.util.ArrayList;
import java.util.List;

public class  Curso {
	private Integer quantidadePeriodos;
	private String nome;
	private String grauAcademico;
	public List<Disciplina> disciplinas = new ArrayList<>();
	
	public Integer getQuantidadePeriodos() {
		return quantidadePeriodos;
	}
	public void setQuantidadePeriodos(Integer quantidadePeriodos) {
		this.quantidadePeriodos = quantidadePeriodos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrauAcademico() {
		return grauAcademico;
	}
	public void setGrauAcademico(String grauAcademico) {
		this.grauAcademico = grauAcademico;
	}
	public void addDisciplina(Disciplina disciplinas) {
		disciplina.add(disciplinas);	
	}
	public void removerDisciplina(Disciplina disciplinas) {
		disciplina.remove(disciplinas);
		
	}

	
	
	
