package boundary;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {
	
	private JMenuBar barra;
	private JMenu arquivo, cadastro;
	private JMenuItem sair, evento, atividade;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		Container janela = getContentPane();
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Controle de Eventos - " + control.AcessarModulo.getModulo());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setBounds(100, 100, 450, 300);
		
		barra = new JMenuBar();
		janela.add(barra);
		
		arquivo = new JMenu("Arquivo");
		arquivo.setSize(100,20);
		barra.add(arquivo);
		
		cadastro = new JMenu("Cadastro");
		cadastro.setSize(100,20);
		barra.add(cadastro);
		
		sair = new JMenuItem("Sair");
		arquivo.add(sair);
		evento = new JMenuItem("Evento");
		cadastro.add(evento);
		atividade = new JMenuItem("Atividade");
		cadastro.add(atividade);
		
		setJMenuBar(barra);
		
		evento.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FrmEvento chama= new FrmEvento();
				chama.setVisible(true);
			}
		});
		
		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}

}
