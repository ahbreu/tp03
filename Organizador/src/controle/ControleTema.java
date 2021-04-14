package controle;
import modelo.*; 

public class ControleTema {
	private Tema[] t;
	private int qtdTemas;
	
	public ControleTema(ControleDados d) {
		t = d.getTemas();
		qtdTemas = d.getQtdTemas();
	}
	
	public String[] getNomeTema() {
			String[] s = new String[qtdTemas];
			for(int i = 0; i < qtdTemas; i++) {
					s[i] = t[i].getNomeTema();
			}
			return s;
	}
	public int getQtd() {
		return qtdTemas;
	}

	public void setQtd(int qtd) {
		this.qtdTemas = qtd;
	}
	
	public String getNome(int i) {		
		return t[i].getNomeTema();
	}
}