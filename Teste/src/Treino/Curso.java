package Treino;

public class  Curso {
	private String quantidadePeriodos;
	private String nome;
	private String grauAcademico;
	private List<Disciplina> disciplina = new ArrayList<>();
  
	
	public String getQuantidadePeriodos() {
		return quantidadePeriodos;
	}
	public void setQuantidadePeriodos(String quantidadePeriodos) {
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
	public String getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	
	
	
	
}
