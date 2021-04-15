package modelo;
public class Tema {
	
	
	
	private String nomeTema;
	private Livro[] tituloLivro;
	
	
	
	
	public Tema(String nomeTema, Livro[] tituloLivro) {
		 this.nomeTema = nomeTema;
		 this.tituloLivro = tituloLivro;
	}
	
	public Tema(String nomeTema) {
		this.nomeTema = nomeTema;
	}
	
	public String toString() {
    	return "Tema do livro:\n" + nomeTema;
    }
	
	public Livro[] getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(Livro[] tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public String getNomeTema() {
		return nomeTema;
	}
	public void setNomeTema(String nomeTema) {
		this.nomeTema = nomeTema;
	}
	
}