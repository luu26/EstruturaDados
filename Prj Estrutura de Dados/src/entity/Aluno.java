package entity;

public class Aluno {
	private String nome;
	private int matricula;
	private String email;
	private float percentualPresenca;
	private float taxaRendimento;
	
	/*public Aluno(){
		this("",0,"",0,0);
	}
	
	public Aluno(String nome, int matricula, String email, float percentualPresenca, float taxaRendimento){
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.percentualPresenca = percentualPresenca;
		this.taxaRendimento = taxaRendimento;
	}*/
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getPercentualPresenca() {
		return percentualPresenca;
	}
	public void setPercentualPresenca(int percentualPresenca) {
		this.percentualPresenca = percentualPresenca;
	}
	
	public float getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
}
