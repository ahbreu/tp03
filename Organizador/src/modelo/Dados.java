package modelo;
import java.util.*;

public class Dados {
	private Autor[] autores = new Autor[50];
	private int qtdAutores = 0;
	private Leitor[] leitores = new Leitor[50];
	private int qtdLeitores = 0;
	private Livro[] livros = new Livro[50];
	private int qtdLivros = 0;
	private Tema[] temas = new Tema[50];
	private int qtdTemas = 0;
	
	
	public void inserirDados() {
		@SuppressWarnings("unused")
		Date d = Calendar.getInstance().getTime();
		for (int i = 0; i < 4; i++) {
			autores[i] = new Autor("Autor"+i, "Email"+i, "Apelido"+i);
			leitores[i] = new Leitor("Leitor"+i, "Email"+i, "Apelido"+i);
			livros[i] = new Livro();
			temas[i] = new Tema("Tema"+i);
		}
		
		qtdAutores = 4;
		qtdLeitores = 4;
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
	
	public Leitor[] getLeitores() {
		return leitores;
	}
	
	public void setLeitores(Leitor[] leitores) {
		this.leitores = leitores;
	}
	
	public int getQtdLeitores() {
		return qtdLeitores;
	}
	
	public void setQtdLeitores(int qtdLeitores) {
		this.qtdLeitores = qtdLeitores;
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
	
	public void setQtdLvros(int qtdLivros) {
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
}