package controle;

import view.*;

import java.util.function.BooleanSupplier;

import javax.swing.JOptionPane;

import modelo.*;
/**
 * Classe que une todos os pacotes do programa
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
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
	 * @param visivel
	 */	
	public void visivel() {
		mp.setVisible(true);
	}
	/**
	 * Permite cadastrar novos livros
	 * @param cadastrar
	 */	
	public void cadastrar( Livro l ) {
		cd.adicionarLivro(l);
		JOptionPane.showMessageDialog(null, "Cadastrado!");
	}	
}