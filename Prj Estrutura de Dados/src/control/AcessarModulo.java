package control;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class AcessarModulo {
	
	private JRadioButton rbFuncionario, rbAluno;
	private static String modulo;
	
	public AcessarModulo(JRadioButton rbFuncionario, JRadioButton rbAluno){
		this.rbFuncionario = rbFuncionario;
		this.rbAluno = rbAluno;
	}
	
	/**
	 * Método que verifica qual foi o módulo escolhido, aluno ou funcionário
	 */
	public void verificaModulo(){
		boundary.FrmPrincipal chama;
		if(rbFuncionario.isSelected()){
			modulo = "Módulo Funcionário";
			System.out.println("Módulo Funcionário");
			chama = new boundary.FrmPrincipal();
			chama.setVisible(true);
		}
		if(rbAluno.isSelected()){
			modulo = "Módulo Aluno";
			System.out.println("Módulo Aluno");
			chama = new boundary.FrmPrincipal();
			chama.setVisible(true);
		}
	}
	
	/**
	 * Método que retorna o módulo escolhido, aluno o funcionário
	 * @return modulo
	 */
	public static String getModulo(){
		return modulo;
	}

}
