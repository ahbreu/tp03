package controle;
import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	public ControleDados() {
		d.inserirDados();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Autor[] getAutores() {
		return this.d.getAutores();
	}
	
	public int getQtdAutores() {
		 return this.d.getQtdAutores();
	 }
	
	public Leitor[] getLeitores() {
		return this.d.getLeitores();
	}
	
	public int getQtdLeitores() {
		return this.d.getQtdLeitores();
	}
	
	public Livro[] getLivros() {
		return this.d.getLivros();
	}
	
	public int getQtdLivros() {
		return this.d.getQtdLivros();
	}
	
	public Tema[] getTemas() {
		return this.d.getTemas();
	}
	
	public int getQtdTemas() {
		return this.getQtdTemas();
	}
	
	public boolean removerLivro(int i) {
		String livroRemovido = d.getLivros()[i].getTitulo();
		if (i == (d.getQtdLivros() - 1)) { // O livro a ser removido está no final do array
			d.setQtdLvros(d.getQtdLivros() - 1);
			d.getLivros()[d.getQtdLivros()] = null;
			return true;
		} else { // O livro a ser removido está no meio do array
				int cont = 0;
				while(d.getLivros()[cont].getTitulo().compareTo(livroRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j = cont; j < d.getQtdLivros() - 1; j++) {
					d.getLivros()[j] = null;
					d.getLivros()[j] = d.getLivros()[j+1];
				}
				d.getLivros()[d.getQtdLivros()] = null;
				d.setQtdLvros(d.getQtdLivros() - 1);
				return true;
		}
}
	public boolean removerAutor(int i) {
		String autorRemovido = d.getAutores()[i].getNome();
		if(i == (d.getQtdAutores() - 1)) { // O autor a ser removido está no final do array
			d.setQtdAutores(d.getQtdAutores() - 1);
			d.getAutores()[d.getQtdAutores()] = null;
			return true;
		} else { // O autor a ser removido está no meio do array
				int cont = 0;
				while(d.getAutores()[cont].getNome().compareTo(autorRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j =cont; j < d.getQtdAutores() - 1; j++) {
					d.getAutores()[j] = null;
					d.getAutores()[j] = d.getAutores()[j+1];
				}
				d.getAutores()[d.getQtdAutores()] = null;
				d.setQtdAutores(d.getQtdAutores() - 1);
				return true;
		}
	}
	public boolean removerTema(int i) {
		String temaRemovido = d.getTemas()[i].getNomeTema();
		if(i == (d.getQtdTemas() - 1)) {//O tema a ser removido está no final do array
			d.setQtdTemas(d.getQtdTemas() - 1);
			d.getTemas()[d.getQtdTemas()] = null;
			return true;
		} else { // O tema a ser removido está no meio do array
				int cont = 0;
				while(d.getTemas()[cont].getNomeTema().compareTo(temaRemovido) != 0) {
					cont++;
				}
				//Rotina swap
				for(int j =cont; j < d.getQtdTemas() - 1; j++) {
					d.getTemas()[j] = null;
					d.getTemas()[j] = d.getTemas()[j+1];
				}
				d.getTemas()[d.getQtdTemas()] = null;
				d.setQtdTemas(d.getQtdTemas() - 1);
				return true;
		}
	}
}