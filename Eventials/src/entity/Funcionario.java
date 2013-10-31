package entity;

public class Funcionario extends Pessoa {
	private String cargo;
	private String matricula;
	
	public String getCargo() {
		return cargo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public boolean importarAluno(){
		//definir logica
		return true;
	}
	
	public boolean importarFuncionario(){
		//definir logica
		return true;
	}
}
