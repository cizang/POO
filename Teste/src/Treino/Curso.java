package Treino;

import java.util.ArrayList;
import java.util.List;

public class  Curso {
	private Integer quantidadePeriodos;
	private String nome;
	private String grauAcademico;
	public List<Disciplina> disciplina = new ArrayList<>();
	
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
	public void addDisciplina(List disciplina) {
		disciplina.add(disciplina);	
	}
	public void removerDisciplina(List disciplina) {
		disciplina.remove(disciplina);
		
	}

	
	
	
