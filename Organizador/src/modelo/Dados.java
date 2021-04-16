package modelo;
import java.util.*;
/*
 * Classe onde se encoontram todos os dados do programa
 */
public class Dados {
	public Livro[] livros = new Livro[50];
	private int qtdLivros = 0;
	private Leitor leitor;
	
	
	public Livro[] getLivros() {
		return livros;
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
	
	
	public Leitor getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
}