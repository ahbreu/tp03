package controle;
import modelo.*;

public class ControleLivro {
	private Livro[] lv;
	private int qtdLivros;
	
	public ControleLivro(ControleDados d) {
		lv = d.getLivros();
		qtdLivros = d.getQtdLivros();
	}
	
	public String[] getNomeLivro() {
			String[] s = new String[qtdLivros];
			for(int i = 0; i < qtdLivros; i++) {
					s[i] = lv[i].getTitulo();
			}
			return s;
	}
	public int getQtd() {
		return qtdLivros;
	}

	public void setQtd(int qtd) {
		this.qtdLivros = qtd;
	}
	
	public String getNome(int i) {		
		return lv[i].getTitulo();
	}
}