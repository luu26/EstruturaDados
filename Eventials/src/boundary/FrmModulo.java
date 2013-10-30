package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class FrmModulo extends JDialog {
	
	private JLabel lblEscolha;
	private ButtonGroup bgModulo;
	private JRadioButton rbFuncionario, rbAluno;
	private JButton btnOk, btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmModulo dialog = new FrmModulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmModulo() {
		setTitle("Módulo");
		setBounds(100, 100, 300, 250);
		setLocationRelativeTo(null);
		setResizable(false);
		Container janela = getContentPane();
		janela.setLayout(null);
		
		lblEscolha = new JLabel("Escolha o módulo desejado:");
		lblEscolha.setBounds(40,20,250,20);
		lblEscolha.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		janela.add(lblEscolha);
		
		rbFuncionario = new JRadioButton("Funcionário");
		rbFuncionario.setBounds(70,60,200,20);
		rbFuncionario.setFont(new Font("Comic Sans MS", Font.BOLD,15));
		rbFuncionario.setSelected(true);
		janela.add(rbFuncionario);
		
		rbAluno = new JRadioButton("Aluno");
		rbAluno.setBounds(70,100,100,20);
		rbAluno.setFont(new Font("Comic Sans MS", Font.BOLD,15));
		janela.add(rbAluno);
		
		bgModulo = new ButtonGroup();
		bgModulo.add(rbFuncionario);
		bgModulo.add(rbAluno);
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(50, 150, 80,25);
		btnOk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				control.AcessarModulo chama = new control.AcessarModulo(rbFuncionario, rbAluno);
				chama.verificaModulo();
				dispose();
			}
		});
		janela.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(150, 150, 90,25);
		janela.add(btnCancelar);
		
	}

}
