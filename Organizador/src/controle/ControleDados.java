package controle;
import modelo.*;

/*
 * Classe que controla todos os cadastros
 */
public class ControleDados {
	private Dados d = new Dados();
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Livro[] getLivros() {
		return this.d.getLivros();
	}
	
	public int getQtdLivros() {
		return this.d.getQtdLivros();
	}
	
	public Leitor getLeitor() {
		return this.getLeitor();
	}
	
	public void setLeitor(Leitor l) {
		d.setLeitor(l);
	}
	
	public void adicionarLivro(Livro l) {
		d.livros[d.getQtdLivros()] =l;
		d.setQtdLivros(d.getQtdLivros()+1);
	}
	
	public String[] getNomeLivros() {
		String[] v = new String[d.getQtdLivros()];
		
		for ( int i = 0; i < d.getQtdLivros(); i++ ) {
			v[i] = d.livros[i].getTitulo();
		}
		return v;
	}
}