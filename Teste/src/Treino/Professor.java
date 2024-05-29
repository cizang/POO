package Treino;

public class Professor {
	private String nome;
	private Integer horasSemanais;
	private String nivelFormação;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer gethorasSemanais() {
		return horasSemanais;
	}
	public void sethorasSemanais(Integer horasSemanais) {
		this.horasSemanais = horasSemanais;
	}
	public String getNivelFormação() {
		return nivelFormação;
	}
	public void setNivelFormação(String nivelFormação) {
		this.nivelFormação = nivelFormação;
	}
	
	@Override
	public String toString() {	
		return "Nome do professor: " + this.nome + 
			" \n Quantidade de horas semanais: " + this.quantidadeHorasSemanais + 
			"\n Nivel de formação: " + this.nivelFormação;
	}
	
	
	
}
