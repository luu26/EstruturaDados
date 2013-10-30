package boundary;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FrmEvento extends JDialog {
	
	private JLabel lblTitulo, lblDescricao, lblAtividade, lblClassificacao, lblPeriodoDuracao, lblHorario;
	private JTextField txtTitulo, txtDescricao, txtPeriodoDuracao, txtHorario;
	private JComboBox cbAtividade, cbClassificacao;
	private Font fonteLabel, fonteText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmEvento dialog = new FrmEvento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmEvento() {
		setTitle("Eventos");
		setBounds(100, 100, 450, 300);
		Container janela = getContentPane();
		janela.setLayout(null);
		setLocationRelativeTo(null);
		
		fonteLabel = new Font("Comic Sans MS", Font.BOLD, 14); 
		fonteText = new Font("Comic Sans MS", Font.PLAIN, 13);
		
		lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(40,30,70,20);
		lblTitulo.setFont(fonteLabel);
		janela.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(120,30,200,20);
		txtTitulo.setFont(fonteText);
		janela.add(txtTitulo);
		
		lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(40,60,70,20);
		lblDescricao.setFont(fonteLabel);
		janela.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(120,60,200,20);
		txtDescricao.setFont(fonteText);
		janela.add(txtDescricao);
		
		lblAtividade = new JLabel("Atividade");
		lblAtividade.setBounds(40,90,70,20);
		lblAtividade.setFont(fonteLabel);
		janela.add(lblAtividade);
		
		cbAtividade = new JComboBox();
		cbAtividade.setBounds(120,90,200,20);
		cbAtividade.setFont(fonteText);
		janela.add(cbAtividade);
		
		lblClassificacao = new JLabel("Classificação");
		lblClassificacao.setBounds(40,120,70,20);
		lblClassificacao.setFont(fonteLabel);
		janela.add(lblClassificacao);
		
		cbClassificacao = new JComboBox();
		cbClassificacao.setBounds(120,120,200,20);
		cbClassificacao.setFont(fonteText);
		janela.add(cbClassificacao);
		
		lblPeriodoDuracao = new JLabel("P. Duração");
		lblPeriodoDuracao.setBounds(40,150,70,20);
		lblPeriodoDuracao.setFont(fonteLabel);
		janela.add(lblPeriodoDuracao);
		
		txtPeriodoDuracao = new JTextField();
		txtPeriodoDuracao.setBounds(120,150,200,20);
		txtPeriodoDuracao.setFont(fonteText);
		janela.add(txtPeriodoDuracao);
		
		lblHorario = new JLabel("Horário");
		lblHorario.setBounds(40,180,70,20);
		lblHorario.setFont(fonteLabel);
		janela.add(lblHorario);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(120,180,200,20);
		txtHorario.setFont(fonteText);
		janela.add(txtHorario);
		
	}
}
