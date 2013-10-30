package boundary;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ImportarAluno;

public class FrmAluno extends JDialog {
	
	private JLabel lblNome, lblMatricula, lblEmail, lblPercentualPresenca, lblTaxaRendimento;
	private JTextField txtNome, txtMatricula, txtEmail, txtPercentualPresenca, txtTaxaRendimento;
	private JButton btnImportar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmAluno dialog = new FrmAluno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmAluno() {
		setTitle("Aluno");
		setBounds(100, 100, 450, 300);
		Container janela = getContentPane();
		janela.setLayout(null);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 35, 70, 15);
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		janela.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(90,35,250,20);
		janela.add(txtNome);
		
		lblMatricula = new JLabel("Matrícula:");
		lblMatricula.setBounds(10, 60,70, 15);
		lblMatricula.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		janela.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(90,60,100,20);
		janela.add(txtMatricula);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 85,70, 15);
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		janela.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(90,85,250,20);
		janela.add(txtEmail);
		
		lblPercentualPresenca = new JLabel("% Presença:");
		lblPercentualPresenca.setBounds(10, 110,70, 15);
		lblPercentualPresenca.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		janela.add(lblPercentualPresenca);
		
		txtPercentualPresenca = new JTextField();
		txtPercentualPresenca.setBounds(90,110,100,20);
		janela.add(txtPercentualPresenca);
		
		lblTaxaRendimento = new JLabel("Taxa Rendimento:");
		lblTaxaRendimento.setBounds(10, 135,70, 15);
		lblTaxaRendimento.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		janela.add(lblTaxaRendimento);
		
		txtTaxaRendimento = new JTextField();
		txtTaxaRendimento.setBounds(90,135,100,20);
		janela.add(txtTaxaRendimento);
		btnImportar = new JButton("Importar");
		btnImportar.setBounds(50,190,100,25);
		
		btnImportar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ImportarAluno chama = new ImportarAluno(txtNome, txtMatricula, txtEmail, txtPercentualPresenca, txtTaxaRendimento);
				try {
					chama.ler();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		janela.add(btnImportar);
		
	}

	/*public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(String nome) {
		this.txtNome.setText(nome);
	}

	public JTextField getTxtMatricula() {
		return txtMatricula;
	}

	public void setTxtMatricula(String matricula) {
		this.txtMatricula.setText(matricula);
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(String email) {
		this.txtEmail.setText(email);
	}

	public JTextField getTxtPercentualPresenca() {
		return txtPercentualPresenca;
	}

	public void setTxtPercentualPresenca(String percentualPresenca) {
		this.txtPercentualPresenca.setText(percentualPresenca);
	}

	public JTextField getTxtTaxaRendimento() {
		return txtTaxaRendimento;
	}

	public void setTxtTaxaRendimento(String taxaRendimento) {
		this.txtTaxaRendimento.setText(taxaRendimento);
	}*/
}
