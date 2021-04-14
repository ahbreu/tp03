package controle;
import modelo.*;

public class ControleAutor {
	private Autor[] a;
	private int qtdAutores;
	
	public ControleAutor(ControleDados d) {
		this.a = d.getAutores();
		this.qtdAutores = d.getQtdAutores();
	}
	
	public String[] getNomeAutor() {
		String[] s = new String[qtdAutores];
		for(int i = 0; i < qtdAutores; i++) {
			s[i] = a[i].getNome();
		}
		return s;
	}
	public int getQtd() {
		return qtdAutores;
	}
	
	public void setQtd(int qtd) {
		this.qtdAutores = qtd;
	}
}