package Treino;
import java.util.ArrayList;
import java.util.List;

public class  Curso {
	private Integer quantidadePeriodos;
	private String nome;
	private String grauAcademico;
	private List<Disciplina> disciplina = new ArrayList<>();
  
	
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
	public List<Disciplina> getDisciplina(){
		return disciplina;
	}
	public void setDisciplina(List<Disciplina>disciplina){
		this.disciplina = disciplina;
	}
	
	
	
	
	
	
}
