package br.edson.projetoBanco;

import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ConexaoBancoDadosApp {

	public static void main(String[] args) {
		
		try {
			Persistence.createEntityManagerFactory("projetoBancoPU");
			JOptionPane.showMessageDialog(null, "conectado ao banco de dados");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "falha na conexão");
		}
		
		

	}

}
