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
	 * M�todo que verifica qual foi o m�dulo escolhido, aluno ou funcion�rio
	 */
	public void verificaModulo(){
		boundary.FrmPrincipal chama;
		if(rbFuncionario.isSelected()){
			modulo = "M�dulo Funcion�rio";
			System.out.println("M�dulo Funcion�rio");
			chama = new boundary.FrmPrincipal();
			chama.setVisible(true);
		}
		if(rbAluno.isSelected()){
			modulo = "M�dulo Aluno";
			System.out.println("M�dulo Aluno");
			chama = new boundary.FrmPrincipal();
			chama.setVisible(true);
		}
	}
	
	/**
	 * M�todo que retorna o m�dulo escolhido, aluno o funcion�rio
	 * @return modulo
	 */
	public static String getModulo(){
		return modulo;
	}

}
