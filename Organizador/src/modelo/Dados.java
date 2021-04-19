package modelo;
import java.util.*;
/**
 * Classe onde se encontram todos os dados do programa
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
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