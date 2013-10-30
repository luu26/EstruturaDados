package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import boundary.FrmAluno;

import entity.Aluno;

public class ImportarAluno{
	private JTextField txtNome, txtMatricula, txtEmail, txtPercentualPresenca, txtTaxaRendimento;
	Aluno[] aluno = new Aluno[1];
	
 public void ler()throws IOException{
  int i;
  String fileName = "ArquivoAluno.txt";

  BufferedReader ler = new BufferedReader(new FileReader( fileName ));

  for (i = 0 ; i < 1 ; i++)
   aluno[i] = new Aluno();

  for (i = 0 ; i < 1 ; i++){
    aluno[i].setNome(ler.readLine());
    aluno[i].setMatricula(Integer.parseInt(ler.readLine()));
    aluno[i].setEmail(ler.readLine());
    aluno[i].setPercentualPresenca(Integer.parseInt(ler.readLine()));
    aluno[i].setTaxaRendimento(Integer.parseInt(ler.readLine()));
   }
  ler.close();
  
  txtNome.setText(aluno[0].getNome());
  txtMatricula.setText(String.valueOf(aluno[0].getMatricula()));
  txtEmail.setText(aluno[0].getEmail());
  txtPercentualPresenca.setText(String.valueOf(aluno[0].getPercentualPresenca()));
  txtTaxaRendimento.setText(String.valueOf(aluno[0].getTaxaRendimento()));
 
   } // fim do método
 
 public ImportarAluno(JTextField txtNome, JTextField txtMatricula, JTextField txtEmail, JTextField txtPercentualPresenca, JTextField txtTaxaRendimento){
	 this.txtNome = txtNome;
	 this.txtMatricula = txtMatricula;
	 this.txtEmail = txtEmail;
	 this.txtPercentualPresenca = txtPercentualPresenca;
	 this.txtTaxaRendimento = txtTaxaRendimento;
 }
 
} // fim da classe
