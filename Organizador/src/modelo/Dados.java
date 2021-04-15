package modelo;
import java.util.*;

public class Dados {
	public Autor[] autores = new Autor[50];
	private int qtdAutores = 0;
	public Livro[] livros = new Livro[50];
	private int qtdLivros = 0;
	public Tema[] temas = new Tema[50];
	private int qtdTemas = 0;
	private Leitor leitor;
	
	
	public void inserirDados() {
		@SuppressWarnings("unused")
		Date d = Calendar.getInstance().getTime();
		for (int i = 0; i < 4; i++) {
			autores[i] = new Autor("Autor"+i, "Email"+i, "Apelido"+i);
			livros[i] = new Livro();
			temas[i] = new Tema("Tema"+i);
		}
		
		qtdAutores = 4;
		qtdLivros = 4;
		qtdTemas = 4;
	}
	
	public Autor[] getAutores() {
		return autores;
	}
	
	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}
	
	public void inserirEditarAutor(Autor a, int pos) {
		this.autores[pos] = a;
		if(pos == qtdAutores) qtdAutores++;
	}
	
	public int getQtdAutores() {
		return qtdAutores;
	}
	
	public void setQtdAutores(int qtdAutores) {
		this.qtdAutores = qtdAutores;
	}
	
	public Livro[] getLivros() {
		return livros;
	}
	
	public void setAutores(Livro[] livros) {
		this.livros = livros;
	}
	
	public void inserirEditarLivro(Livro l, int pos) {
		this.livros[pos] = l;
		if(pos == qtdLivros) qtdLivros++;
	}
	
	public int getQtdLivros() {
		return qtdLivros;
	}
	
	public void setQtdLivros(int qtdLivros) {
		this.qtdLivros = qtdLivros;
	}
	
	public Tema[] getTemas() {
		return temas;
	}
	
	public void setTemas(Tema[] temas) {
		this.temas = temas;
	}
	
	public int getQtdTemas() {
		return qtdTemas;
	}
	
	public void setQtdTemas(int qtdTemas) {
		this.qtdTemas = qtdTemas;
	}
	
	public Leitor getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
}