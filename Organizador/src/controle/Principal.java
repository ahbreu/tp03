package controle;

import view.*;

import javax.swing.JOptionPane;

import modelo.*;
/**
 * Classe que une todos os pacotes do programa
 */
public class Principal {

	CadastroLivro cadliv = new CadastroLivro(this);
	public MenuLivro mlv = new MenuLivro(this);
	public MenuLeitor ml = new MenuLeitor(this, cadliv, mlv);
	public MenuPrincipal mp = new MenuPrincipal(cadliv, ml, mlv);
	
	ControleDados cd = new ControleDados();
	
	public Principal() {
		mp.setVisible(true);
	}
	/**
	 * Deixa o menu visível
	 */	
	public void visivel() {
		mp.setVisible(true);
	}
	/**
	 * Permite cadastrar novos livros
	 */	
	public void cadastrar( Livro l ) {
		cd.adicionarLivro(l);
		JOptionPane.showMessageDialog(null, "Cadastrado!");
	}
	
}