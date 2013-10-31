package entity;

public class Aluno extends Pessoa {
	private String matricula;
	private float percentualPresenca;
	private float taxaRendimento;
	
	public String getMatricula() {
		return matricula;
	}
	
	public float getPercentualPresenca() {
		return percentualPresenca;
	}
	
	public float getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setPercentualPresenca(int percentualPresenca) {
		this.percentualPresenca = percentualPresenca;
	}	
	
	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public boolean solicitarInscricao(){
		//definir logica		
		return true;
	}
	
}
