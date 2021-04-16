package modelo;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Classe que contém informações privadas dos livros
 */
public class Livro {
	
	
	
	private String titulo;
	private int anoPublicacao;
	private String descricao;
	private String autor;
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	String dataCadastro = data.format(new Date());
	
	
	
	public Livro(String tituloLivro, int anoPublicacaoLivro, String descricaoLivro, String dataCadastroLivro) {
		titulo = tituloLivro;
		anoPublicacao = anoPublicacaoLivro;
		descricao = descricaoLivro;
		dataCadastro = dataCadastroLivro;
	}
	
	public String toString() {
    	return "Titulo do livro:\n" + titulo + "\nAno de publicação:\n" + anoPublicacao + "\nDescrição do livro:\n" + descricao + "\nData de cadastro:\n" + dataCadastro;
    }
	
	public Livro(){
		titulo = "tituloLivro";
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	}